import java.util.*;
class PRIME
{
     
    boolean isPrime(int p) // Function for checking whether a number is prime or not
    {
        int c = 0;
        for(int i = 1; i<=p; i++)
        {
            if(p%i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }
     
   public static void main(String args[])
   {
       PRIME ob = new PRIME();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of rows: ");
       int r1 = sc.nextInt();
       System.out.print("Enter the number of columns: ");
       int c1 = sc.nextInt();
        if(r1 < 3 || r1 > 19||c1<3||c1>19){
            System.out.println("SIZE OUT OF RANGE");
            return;
        }
        
       int arr[][]=new int[r1][c1]; // 2D array for storing 'r*c' prime numbers
       int B[] = new int [r1*c1]; // 1D array for storing 'r*c' prime numbers
        
       int i = 0, j;
       int k = 1; // For generating natural numbers
        
       /* First saving the 'r*c' prime numbers into a 1D Array */
       while(i < r1*c1)
       {
           if(ob.isPrime(k)==true)
           {
                   B[i] = k;
                   i++;
           }
           k++;
       }
        
       /* Saving the 'r*c' prime numbers from 1D array into the 2D Array */
       int x = 0;
       for(i=0;i<r1;i++)
        {
           for(j=0;j<c1;j++)
           {
               arr[i][j] = B[x];
               x++;
           }
        }
             
       /* Printing the resultant 2D array */
       System.out.println("The Filled Array is :");
       for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
            System.out.println();
        }
   }
}



