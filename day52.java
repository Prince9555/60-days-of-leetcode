public class day52 {

    public static int friendspair(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        int single=friendspair(n-1);
        int doublee=friendspair(n-2);
        int somemoreway=(n-1)*doublee;
        int total=single+somemoreway;
        return total;
    }

    public static void printBinaryString(int n,int lastPlace,String  str)
    {

      if(n==0)
      {
        System.out.println(str);
        return;
      }
      printBinaryString(n-1, 0, str+"0");
       if(lastPlace==0)
       {
        printBinaryString(n-1,  1, str+"1");
       }

    }
    
    

    public static void main(String[] args) {
     //   System.out.println(friendspair(3));
     printBinaryString(3, 0, "");

    }
}


//leetcode 

/*class Solution {
    public int search(int[] nums, int target) {
        int n=0;
        int last=nums.length-1;
        while(n<=last)
        {
            int mid=(last-n)/2+n;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                last=mid-1;
            }
            else{
                n=mid+1;
            }
        }
        return -1;
        
    }
} */
