import java.util.*;
public class day53 {
//merge sort

public static void printArr(int arr[])
{
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]+" ");
  }
  System.out.println();
}

    public static void mergesort(int arr[],int si,int ei)
{

    if(si>=ei)
    {
        return;
    }
    int mid=si+(ei-si)/2;
    mergesort(arr, si, mid);//left
    mergesort(arr,mid+1, ei);//right
    merge(arr,si,mid,ei);

}


public static void merge( int arr[],int si,int mid,int ei )
{
  int temp[]=new int[ei-si+1];
  int i=si;//iterator for left
  int j=mid+1;//iterator for right
  int k=0;//for temp
  while(i<=mid&&j<=ei)
  {
    if(arr[i]<arr[j])
    {
        temp[k]=arr[i];
        i++;k++;
    }
    else{
        temp[k]=arr[j];
        j++;k++;
    }}

    //left part
    while(i<=mid)
    {
        temp[k++]=arr[i++];
    }
    //right
    while(j<=ei)
    {
        temp[k++]=arr[j++];
    }
    for(k=0,i=si;k<temp.length;k++,i++)
    {
        arr[i]=temp[k];
    }
  }





 
 

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
        
    }
    
}


//leetcode 169 majority question

/*class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount=nums.length/2;

        for(int i=0;i<nums.length;i++) 
        {
            int count=0;
            for(int j=0;j<nums.length;j++) 
            {
                if(nums[j] ==nums[i])
                 {
                     count+=1;
                     }
                     }
                     if(count > majorityCount)
                      {
                          return nums[i];
                          }
                          }
                          return-1;
    
        
    }
} */