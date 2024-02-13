import java.util.*;
public class recussion {
    public static void printdec(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printdec(n-1);
    }


    public static void printascending(int n, int i)
    { 
        
     
        if(n==i)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printascending(n+1,i);
    }



     public static void printfact(int n,int fact)
    {  
        if(n==1)
        {
            
            System.out.println(fact);
            return;
        }
        fact=fact*n;
        printfact(n-1,fact);
    }



    
    public static int  printfactapna(int n)
    {  
        if(n==1)
        {
            return 1;
        }
        int fnm1=printfactapna(n-1);
        int fn=n*printfactapna(n-1);
        return fn;
    }



    public static int  printsumofNapna(int n)
    {  
        if(n==1)
        {
            return 1;
        }
        int fnm1=printsumofNapna(n-1);
        int sumOfN=n+printsumofNapna(n-1);
        return sumOfN;
    }


    public static void prisum(int n,int sum)
    {  
        if(n==1)
        {
            
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        prisum(n-1,sum);
    }




public static int fib(int n)
{
if(n==0||n==1)
{
    return n;
}
int fn1=fib(n-1);
int fn2=fib(n-2);
 
return fn1+fn2;
}

public static boolean issorted(int arr[],int index)
{
if(index==arr.length-1)
{
    return true;
}
if(arr[index]>arr[index+1])
{
    return false;
}
return issorted(arr, index+1);
}



public static int lastocc(int arr[],int key,int index)
{
    if(index==arr.length)
    {
        return -1;
    }
     int isFound =lastocc(arr, key, index+1);
     if(isFound== -1 && arr[index] == key)
     {
        return index;
     }
     return isFound;
    }

public static int  isPOwer(int x ,int n)
{
    if(n==0)
    {
        return 1;
    }
     
    return x * isPOwer(x, n-1);
}




public static int  isPOweroptimed(int x ,int n)
{
    if(n==0)
    {
        return 1;
    }
    int halfpower=isPOweroptimed(x, n/2);
      int halfway=halfpower*halfpower; 
      if(n%2!=0)
      {
     halfway=x*halfway;
      }
      return halfway;
    }




    public static int tilling(int n)
    {
        if(n==0|| n==1)
        {
            return 1;
        }
        int vertical=tilling(n-1);
        int horizontal=tilling(n-2);
        return vertical+horizontal;
    }
    


    public static void  removeduplicate(String str,int idx,StringBuilder newstr,boolean map[])
    {
        if(idx==str.length())
        {
            System.out.println(newstr);
            return;
        }
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']==true)
        {
            removeduplicate(str, idx+1, newstr, map);
        }else{
            map[currentChar-'a']=true;
            removeduplicate(str, idx+1, newstr.append(currentChar), map);
        }
    }


    public static int friendPair(int n)
    {
        if(n==1|| n==2)
        {
            return n;
        }
        int pairWays=(n-1)*friendPair(n-2);
        return (friendPair(n-1)+pairWays);
    }

    public static void main(String[]args)
    {
        int n=5;
          //System.out.println("the factorial of a number "+n+"is :");
        int fact=1;
        int sum=1;
        Scanner sc =new Scanner(System.in);
          /*  System.out.println("enter a number to printed 1 to i");
          int i=sc.nextInt();  */
          //printdec(n);  //to print a number in decending order
          // printascending(n,i); //to print a number in ascending order
             // printfact(n, fact);  //to calculate fact by my way
         //    System.out.println(printfactapna(n));//to calculate the fact by apna college
         //  System.out.println(printsumofNapna(n));//to print the sum of n number
          // prisum(n, sum);//to print the sum of n number
           // System.out.println(fib(25)); //to print a fibonacci number upto n 

           int arr[]={8,3,6,9,5,10,2,5,3};
           int index=0;
             //System.out.println( issorted(arr, index));  //to chek array is sorted
          //  System.out.println( lastocc(arr, 5, 0)) ;

          //  System.out.println(isPOwer(2, 10));  //to claculate the power of any number
          //   System.out.println(isPOweroptimed(2,10));//to claculate the power in more optimed way
        //   System.out.println(tilling(3));  //question on tilling asked in amazon to fit the tiles
         /*String str="appnnnacollege";
        removeduplicate(str, 0, new StringBuilder(" "), new boolean[26]);*///this is use to remove the duplicate in a string str for example appnnacollege
         // System.out.println(friendPair(5));//to find the number  of ways for friends pair

    }

    
}
