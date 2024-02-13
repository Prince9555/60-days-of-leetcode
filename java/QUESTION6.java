import java.util.*;
    public class QUESTION6
    {
    public static void main() 
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str=sc.nextLine();
    int l=str.length();
    String a[]=new String[l];
     int p=0,x=0,i,j;
     String t;
     for(i=0;i< l;i++)
     {
     char ch=str.charAt(i);
     if(ch==' '||ch=='.')
     {
     a[x]=str.substring(p,i);
     System.out.print(a[x]+" ");
     x++;
     p=i+1;
     }
     }
System.out.println();
      for(i=0;i< x;i++)
     {
     for(j=0;j< x-i-1;j++)
     {
 if(a[j].length() > a[j+1].length())
     {
     t=a[j];
     a[j]=a[j+1];
     a[j+1]=t;
    }
     }
     }

     String s=a[0];
     char ch=s.charAt(0);
     System.out.print(Character.toUpperCase(ch));
     System.out.print(s.substring(1));
     for(i=1;i< x;i++)
     {
     System.out.print(" "+a[i]);
     }
     System.out.print(".");
     }}    


