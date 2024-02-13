import java.util.*;
public class hollow_pattern {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number n for star ");
       int n=sc.nextInt();
       for(int i=1;i<=n;i=i+1)
       {
        for(int j=1;j<=n;j=j+1)
        {
            if(j==1||j==n||i==1||i==n)
            {
            System.out.print("* " );
            }
            else {
                System.out.print("  ");
            }
        }
        
        System.out.println();
       
    }


}
}
