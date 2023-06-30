import java.util.*;
public class day54 {

     public static void printArr(int arr[])
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }


       public static void quicksort(int arr[],int si,int ei)
       {
        if(si>=ei)
        {
            return ;
        }
        int pIdx=partiton(arr,si,ei);
        quicksort(arr, si, pIdx-1);//left
        quicksort(arr, pIdx+1, ei);//right
       }

       public static int partiton(int arr[],int si,int ei)
       {
        int pivot=arr[ei];
        int i=si-1;//jagah bannana
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)

            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
       }

    public static void main(String[] args) {
        
       int arr[]={6,3,9,8,2,5};
       //quicksort(arr,0,arr.length-1);  quicksort algp nlogn 
       printArr(arr);

    }
    
}

//leetcode
/*class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[i]<=nums[mid]){
                if(nums[mid]>target && nums[i]<=target){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else if(nums[i]>nums[mid]){
                if(nums[mid]<target && nums[j]>=target){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
} */
