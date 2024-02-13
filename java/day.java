
import java.io.*;
class day
{
      public static void main(String [] args)throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String print_week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday ","Friday ","Saturday"};
          String week[]={"Monday","Tuesday","Wednesday","Thursday ","Friday ","Saturday","Sunday"};
          int dd,mm,yy;
          System.out.println("INPUT:");
          System.out.print("Day in first January:");
          String d1=br.readLine();
          System.out.print("Year:     \t\t");
          int yyyy=Integer.parseInt(br.readLine());
          System.out.print("Enter a date:\t\t");
          int n=Integer.parseInt(br.readLine());
          dd=n/10000;
          n=n%10000;
          mm=n/100;
          yy=n%100;
          int count =00;
          int extra=0;
          boolean status=true;
          System.out.println("OUTPUT");
          if(yyyy%4==0)
          {
              int month[]={dd,31,29,31,30,31,30,31,31,30,31,30,31};
              if(mm<=12&&dd<=month[mm])
              {
                  for(int i=0;i<mm;i++)
                      count=count+month[i];
              }
              else
              status=false;
          }  
          else
          {
              int month[]={dd,31,28,31,30,31,30,31,31,30,31,30,31};
              if(mm<=12&&dd<=month[mm])
              {
                  for(int i=0;i<mm;i++)
                      count=count+month[i];
              }
              else
              status=false;
          }
          if(!status)
          {
              System.out.println("Wrong date ");
          }
          else
          {
              status=false;
              for(int i=0;i<7;i++)
              {
                  if(week[i].equalsIgnoreCase(d1))
                  {
                      extra=i;
                      status=true;
                  }
              }
              if(!status)
              {
                  System.out.println("Spealing mistake in WEEK ");
              }
              else
              {
                  count=(extra+count);
                  count%=7;
                  System.out.println("Day is "+print_week[count]);
              }
          }   
     }
}