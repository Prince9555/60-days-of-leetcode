import java .util.*;

import javax.lang.model.util.ElementScanner14;
public class D2ARRAY {


    public static void basicaaray(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
        
            }
            System.out.println();
        }
    }




    public static void sprialarray(int arr[][])
    {
        int startrow=0,startcol=0,endrow=arr.length-1,endcol=arr[0].length-1;
        while(startcol<endcol&&startrow<endrow)
        {

        //top
        for(int j=startcol;j<=endcol;j++)
        {
            System.out.print(arr[startrow][j]+" ");
        }
         //right
         for(int i=startrow+1;i<=endrow;i++)
         {
             System.out.print(arr[i][endcol]+" ");
         }
          //bottom
        for(int j=endcol-1;j>=startcol;j--)
        {
            if(startrow==endrow)
            {
                break;
            }
            System.out.print(arr[endrow][j]+" ");
        }
         //left
         for(int i=endrow-1;i>=startrow+1;i--)
         {
            if(startcol==endcol)
            
            {break;}
             System.out.print(arr[i][startcol]+" ");
         }
         startcol++;
         startrow++;
         endcol--;
         endrow--;
        }
        System.out.println();
    }



    public static boolean staircaseSeach(int arr[][],int key)
    {
int i=0,j=arr[0].length-1;
while(i<arr.length&&j>=0)
{
    if(arr[i][j]==key)
    {
        System.out.println("found the key at ("+i+","+j+")");
        return true;
    }
    else if(key<arr[i][j])
    {
        j--;
    }
     else{
        i++;
     }
}
System.out.println("key not found");
return false;
    }

    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        System.out.println("enter the number of  coloums");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        //taking the value
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
        }
      
    
       //  basicaaray(arr);  // to print a basic array
         //sprialarray(arr);  //to print the array in sprial order
      int key =33;
       staircaseSeach(arr, key);
}
}

