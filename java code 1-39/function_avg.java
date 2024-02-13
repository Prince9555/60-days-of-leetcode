import java.lang.Thread.State;
import java.util.*;
public class function_avg {
    public static double avg(double a,double b,double c)
    {
       return (a+b+c)/3;
    }
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    double a=sc.nextDouble();
    System.out.println("enter the value of b");
    double b=sc.nextDouble();
    System.out.println("enter the value of c");
    double c=sc.nextDouble();

    System.out.println(avg(a, b, c));
    }
}
