 import java.util.*;
public class function111pra {


public static int sum(int num1,int num2)// to find sum
{

int su=num1+num2;
return su;
}



public static void swap(int num1,int num2)// to find sum
{
int temp=num1;
num1=num2;
num2=temp;
System.out.println(num1);
System.out.println(num2);

}
public static int factorial(int num1)
{

int f=1;
for(int i=1; i<=num1; i++)
{
    f=f*i;
}
return f;

}


public static int binomial(int num1,int num2) 
{

int fact_n=factorial(num1);
int fact_r=factorial(num2);
int fact_n_r=factorial(num1-num2);
int bin=fact_n/(fact_r*fact_n_r);
    return bin;
}


public static boolean isPrime(int num1)
{
    if(num1==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(num1); i++)
    {
        if(num1%i==0){
            return false;
        }
    }
    return true;
}

public static void rangeprime(int num1){
    for(int i=2; i<=num1; i++){
        boolean and=isPrime(i);
        if(and==true){
            System.out.print(i+" ");
        }
    }
}

public static void halfper(int n){
   
    for(int i=0; i<=n; i++)
    {
        for(int j=1; j<=n-i; j++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

}

public static void half01(int n){
   
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++){
            if((i+j)%2==0)
            {
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }

        }
        System.out.println();
    }
}

public static void rec(int n){
   
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++){

            if(i!=1&&j!=1&&i!=n&&j!=n){
                System.out.print(" ");
            }
            else{

            System.out.print("*");
            }

        }
        System.out.println("");
    }
}

public static void butterfly(int n)
{
  
for(int i=1; i<=n; i++)
{
 for(int j=1; j<=i; j++)
 {
    System.out.print("*");// star
 }
 for(int j=1; j<=(2*n-2*i); j++)
 {
   System.out.print(" ");
 }
 for(int j=1; j<=i; j++)
 {
    System.out.print("*");
 }
 System.out.println();
}
for(int i=n; i>=1; i--)
{
    for(int j=1; j<=i; j++)
    {
       System.out.print("*");// star
    }
    for(int j=1; j<=(2*n-2*i); j++)
    {
      System.out.print(" ");
    }
    for(int j=1; j<=i; j++)
    {
       System.out.print("*");
    }
    System.out.println();
   }
}








 


    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter a number a:");
        int a=sc.nextInt();
        
        System.out.println("enter a number b:");
        int b=sc.nextInt();

        //System.out.print(sum(a,b));
        //  swap(a,b);
       //  factorial(a);
    //   System.out.println( binomial(a,b));
      //System.out.println(isPrime(a));
      //rangeprime(a);

      //-------------------------------------------------------advanced patt-----------
     // halfper(a);
      // half01(a);
      // rec(a);
      butterfly(a);
    }
    
}
