import java.security.PublicKey;

public class day47 {
    
    /*
leetcode shuffle th array 

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr []=new int[2*n];
        int j=0;
        for(int i=0;i<arr.length-1;i=i+2)
        {
            arr[i]=nums[j++];
            arr[i+1]=nums[n++];
        }
        return arr;

    }
}




leetcode add two string compare using  equals

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x ="";
        String y ="";
        for(int i=0;i<word1.length;i++)
        {
            x=x+word1[i];
 

        }
        for(int i=0; i<word2.length;i++)
        {
            y+=word2[i];
        }

             if(x.equals(y))
             {
                 return true;
             }
        return false;
         
    }
}*/


//recusrion 1
 public static void rec(int n){
    if(n==1)
    {
          System.out.println(n);
          return;
    }
    System.out.println(n+" ");
    rec(n-1);
    
}


//rec2
public static void rec1(int n,int i){

    if(n==i)
    {
        System.out.print(n+" ");
        return;
    }
    System.out.print(n+" ");
rec1(n+1,i);
}


//fact
public static int  fact(int n)
{
    if(n==1)
    {
        return 1;
    }
    int sum=n*fact(n-1);
    return sum;
}

public static int sum(int n)
{
    if(n==1)
    {
        return 1;
    }
    int sum=n+sum(n-1);
    return sum;
}

public static int fib(int n)
{
     if(n==0||n==1)
     {
        return n;
     }
    return fib(n-1)+fib(n-2);
}
 



    public static void main(String[] args) {
        int n=15;
        //rec1(1,50);
       // System.out.print( fact(5));
        // System.out.print(sum(10));
        System.out.print(fib(6));
        

    }
    
}
