 import java.util.*;
public class binomial_coefficent_optimise {
    public static int factor (int n)
    {
        int fact =1;
        for(int i = 1;i<=n;i++)
        { 
             
              fact=fact*i;
        }
             return fact;
             
        }
        public static int b_coeff(int n,int r)
        {
            int fact_n=factor(n);
            int fact_r=factor(r);
            int fact_nmr=factor(n-r);
            int bin_co_eff=fact_n/(fact_r*fact_nmr);
            return bin_co_eff;
        }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter the value of n to find the factorial");
        int n = sc.nextInt();
        int r=sc.nextInt();
         
             
        int number=b_coeff(n, r);
        System.out.println("the factorail of a number is :"+number);
    }
}

