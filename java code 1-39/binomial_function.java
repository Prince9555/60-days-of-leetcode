import java.util.*;
public class binomial_function {

    public static int binomial_coefficent(int n,int r) {
        int f=1,r0=1,ni=1;
        for(int i=1;i<=n;i++)
     {
        f=f*i;
       

     }
     System.out.println("the value of n! is "+f);
     for(int j=1;j<=r;j++)
     {
        r0=r0*j;

     }
     System.out.println("the value of r0! is "+r0);
     for(int k=1;k<=(n-r);k++)
     {
        ni=ni*k;
     } 
     System.out.println("the value of ni! is "+ni);
     int bin=(f/(r0*ni));

    return bin; 
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n ");
    int n=sc.nextInt();
    System.out.println("enter the value of r");
    int r=sc.nextInt();
    int finallbin=binomial_coefficent(n,r);
    System.out.println(finallbin);

}
}
