
import java.util.*;
public class CircularPrime
{
int n,m,c,f,i,a,b,j,f1;
void circularPrime(int x)
{
    c=0;
    n=x;
    f=0;
    while(n!=0)
    {
        n/=10;
        c++;
    }
    n=x;
    System.out.println("output");
    System.out.println("====");
    for(i=0;i<c;i++)
    {
        f= isPrime(n);
        if(f==1)
        System.out.println(n);
        else
        {
        System.out.println("not a circular prime number");
        break;
    }
    a=n%((int)Math.pow(10,c-1));
    b=n/((int)Math.pow(10,c-1));
    m=a*10+b;
    n=m;
}
if(f==1)
System.out.println(" circular prime number");
}
int isPrime(int x)
{
    f1=1;
    for(j=2;j<x;j++)
    {
        if(x%j==0)
        {
            f1=0;
            break;
        }
    }
    return f1;
}
public static void main(String args[])
{
int n,m,c,f,i;
Scanner sc=new Scanner(System.in);
 System.out.println("enter a number:");
 n=sc.nextInt();
 CircularPrime ob = new CircularPrime();
 ob.circularPrime(n);
}
}

    

    
