import java .util.*;
 
public class array_sorting {
public static void bubbleSort(int arr[])
{
    int n=arr.length;
for(int turn=0;turn<(n-1);turn++)
{
    for(int j=0;j<n-1-turn;j++)
    {
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}
System.out.println();
}


public static void SelectionSort(int arr[])
{
    int n=arr.length;
for(int turn=0;turn<(n-1);turn++)
{
    int minPos=turn;
    for(int j=turn+1;j<n;j++)
    {
        if(arr[minPos]>arr[j])
        {
           minPos=j;
        }
    }
    int temp=arr[minPos];
    arr[minPos]=arr[turn];
    arr[turn]=temp;
}
}



public static void InsertionSort(int arr[])
{
    int n=arr.length;
for(int i=1;i<(n);i++)
{
int cuu=arr[i];
int prev=i-1;
while(prev>=0&&arr[prev]>cuu)
{
    arr[prev+1]=arr[prev];
    prev--;
}
//insertion
arr[prev+1]=cuu;
}
}


public static void CountinSort(int arr[])
{
    int n=arr.length;
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        largest=Math.max(largest,arr[i]);
    }
int count[]=new int[largest+1];
for(int i=0;i<arr.length;i++)
{ 
    count[arr[i]]++;
}
int j=0;
for(int i=0;i<count.length;i++)
{
    while(count[i]>0)
    {
        arr[j]=i;
        j++;
        count[i]--;
    }
    }
}






public static void PrintArrayt(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public static void PrintArray(Integer arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String [] args)
    {
        int arr[]={5,4,1,3,2};//run for all the but not inbuilt fuction to reverse a array

           //CountinSort(arr); // to sort a code in incresing order using Counting sort 
         //InsertionSort(arr);//to sort a code in incresing order using insertion sort 
         //bubbleSort(arr);  //to sort a code in incresing order using bubble sort 
         //SelectionSort(arr); //to sort a array in ascending order using selection sort

         // Arrays.sort(arr);  // to sort the whole array in ascending order 
         //Arrays.sort(arr,0,3);//to sort the limit of arry from index n to index m
           PrintArrayt(arr);  //run for all the but not inbuilt fuction to reverse a array
         

         //---------------------------------------------------------------------------



         /*Integer arr[]={5,4,1,3,2};
         Arrays.sort(arr,Collections.reverseOrder());
         PrintArray(arr);*/
       

    }
    
}
