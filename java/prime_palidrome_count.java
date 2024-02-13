import java.io.*;
class prime_palidrome_count
{
   public static void main(String args[])throws IOException
    {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    {
    System.out.print("m=");
    int m=Integer .parseInt(br.readLine()); 
     System.out.print("n=");
    int n=Integer.parseInt(br.readLine());
    if(m>3000||n>3000||m>n)
    {
    System.out.print("out of range");  
        return;
    }
    int count=0;
    System.out.print("the prime palidrome integer are:");
    for(int i=m;i<n;i++)
    {
        if(isPalidrome(i)&&isPrime(i))
        {
            if(count==0)
            System.out.print(i);
            else
            System.out.print(" "+i);
            count++;
        }
    }
    System.out.println();
    System.out.print("prime integer:"+count);
}
}
public static  boolean isPalidrome(int n)
{
    int rev=0;
    for(int i=n;i>0;i/=10)
    rev=rev*10+i%10;
    return n==rev;
}
public static boolean isPrime(int n)
{
    int f=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        f++;
        if(f>2)
        return false;
    }
    return f==2;
}
}