import java.util.*;
public class charpatt
 {
    public static void main(String[] args)
    {
        char ch ='A';//these pattern will on this(a  bc   def   ghij)
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number n for star ");
       int n=sc.nextInt();
       for(int i=1;i<=n;i=i+1)
       {
        //char ch ='A';//(another patten will work( a  ab   abc    abcd))
        for(int j=1;j<=i;j=j+1)
        {
           
             
            System.out.print(ch);
            ch++;
             
        }
   
        System.out.println();
       }
    }
}

