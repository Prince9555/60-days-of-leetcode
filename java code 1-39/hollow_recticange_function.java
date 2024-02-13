import java.util.*;
public class hollow_recticange_function {
    public static void hollowRec(int n)
    {
        for(int i=1;i<=n;i=i+1)
       {
        for(int j=1;j<=n;j=j+1)
        {
            if(j==1||j==n||i==1||i==n)
            {
            System.out.print("* " );
            }
            else {
                System.out.print("  ");
            }
        }
        
        System.out.println();
    }}
    public static void inverted_rotated_patt(int n)
    {
        for(int i=1;i<=n;i=i+1)
        {
         for(int j=1;j<=n-i;j=j+1)//spaces
         {
 
               System.out.print("  ");
         }
 
         for(int j=1;j<=i;j=j+1)//to print stars
         {
             System.out.print("*"+" " );
         }
         System.out.println();
        }
    }
     public static void inverted_half_prymadid_with_number(int n)
     {
        for(int i=1;i<=n;i=i+1)
            { 
            int nu=1;
             for(int j=i;j<=n;j=j+1)          //we can use for(int j=1;j<=n-i+1;j++) { sop(j+"  ");
                {  
                   System.out.print(nu+" ");
                   nu++;
                }
            System.out.println();
            }
        }
            public static void floyd_triangle(int n)
              {
                int nu=1;
               for(int i=1;i<=n;i=i+1)
               { 
            
                 for(int j=1;j<=i;j=j+1)           
                {  
                   System.out.print(nu+"  ");
                   nu++;
                    
                }
            System.out.println();
            }
    }
    public static void  triangle_0_1(int n)
    {
       
     for(int i=1;i<=n;i=i+1)
     { 
  
       for(int j=1;j<=i;j=j+1)           
      {  
        
        if((i+j)%2==0)
        {
            System.out.print("1"+" ");
        }
        else{
            System.out.print("0"+" ");
        }
          
      }
  System.out.println();
  }
} 




          public static void butterfly(int n)
            {  //first half
         for(int i=1;i<=n; i++)
       { 
        //stars
        for(int j=1;j<=i;j++) 
        {      
            System.out.print("*" );    
           }


           //spaces
           for(int j=1;j<=2*(n-i); j++) {
            System.out.print( " ");  
           }


           //stars
           for(int j=1;j<=i; j++)   {       
            System.out.print("*" );    
           }
           System.out.println( );
       }
        //2 half
        for(int i=n;i>=1;i--)
        { 
         //stars
         for(int j=1;j<=i; j++) 
         {      
             System.out.print("*" );    
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++) {
             System.out.print( " ");  
            }
            //stars
            for(int j=1;j<=i;j++)   {       
             System.out.print("*" );    
            }
            System.out.println( );
         }}



         public static void solid_rhombus(int n)
         
         {
            for(int i=1;i<=n;i=i+1)
            {
                //space
                for(int j=1;j<=n-i;j=j+1)
                {
                    System.out.print( "  " );
                }

                
                //stars
             for(int j=1;j<=n;j=j+1)
             {
                 System.out.print("*"+" " );
             }
             System.out.println( );
         }
        }

        public static void hollow_rhombus(int n)
        {
            for(int i=1;i<=n;i=i+1)
            {
                //space
                for(int j=1;j<=n-i;j=j+1)
                {
                    System.out.print( "  " );
                }

                
                //stars
             for(int j=1;j<=n;j=j+1)
             {
                if(j==1||j==n||i==1||i==n)
            {
            System.out.print("* " );
            }
            else {
                System.out.print("  ");
            }
             }
             System.out.println( );
         }
        
        }



        public static void diamond(int n)
           {

            //first half of diamond/
            for(int i=1;i<=n;i=i+1)
              { 
                //space
  
       for(int j=1;j<=n-i;j=j+1)    
       {
        System.out.print("  ");
       }       
       //star
       for(int j=1;j<=(2*i-1);j++)
       {
        System.out.print("*"+" ");
       }
      System.out.println();
    }

    //2half of diamond
    for(int i=n;i>=1;i--)
    {
          
       for(int j=1;j<=n-i;j=j+1)    
       {
        System.out.print("  ");
       }       
       //star
       for(int j=1;j<=(2*i-1);j++)
       {
        System.out.print("*"+" ");
       }
      System.out.println();
    
    }
}
        
    
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number n for star ");
        int n=sc.nextInt();
        //---------------------------------------
           hollowRec(n);//yaha ham usse call kar rahe hai phir hamra dusa function work kar raha hai
        //to print a hollow rectangle
        //-----------------------------------------
           inverted_rotated_patt(n);
           //to print inverted and roated star pattern
          //--------------------------------------------------------
           inverted_half_prymadid_with_number(n);
         //-------------------------------------
           floyd_triangle(n);

         //-------------------------------------------------
      triangle_0_1(n);
          //-----------------------------------------------
          
          butterfly(n);
          //-------------------------------------------------
        solid_rhombus(n);
        //--------------------------------------------------
          hollow_rhombus(n);
        //-------------------------------------------
         diamond(n);
    }
}
