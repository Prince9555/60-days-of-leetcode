import java.util.*;
public class pattern1  
    
 
 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number n for star ");
       int n=sc.nextInt();
       /*for(int i=1;i<=n;i=i+1)
       {
        for(int j=1;j<=i;j=j+1)
        {
            System.out.print("*"+" " );
        }
        System.out.println();
       }
       it print the code in 
       ------------------------------
       *
       **
       ***
       ****
       ----------------------------------
       
       */


      /* for(int i=1;i<=n;i=i+1)
       {
        for(int j=i;j<=n;j=j+1)
        {
            System.out.print("*"+" " );
        }
        System.out.println();
    }
    it print the code in 
    ---------------------------
    ****
    ***
    **
    *
    -----------------------------------------
    */
    
    /*for(int i=1;i<=n;i=i+1)
    { int nu=1;
     for(int j=i;j<=n;j=j+1)
     {  
         System.out.print(nu+" ");
         nu++;
     }
     System.out.println();
 }
 it print the code in 
 -------------------------------------------------
 12345
 1234
 123
 12
 1
 ----------------------------------------------------------
 
  
 
 
 */
/* 
---------------------------------------------------------------------------------
for(int i=1;i<=n;i=i+1)
       {
        for(int j=1;j<=n-i;j=j+1)
        {

              System.out.print("  ");
        }

        for(int j=1;j<=i;j=j+1)
        {
            System.out.print("*"+" " );
        }
        System.out.println();
       }
       -------------------------------------------------------------------------
                 *
                ** 
               *** 
              **** 
             ***** 
        ----------------------------------------------------------------------------
 */
}}