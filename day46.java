
import java.util.*;
class day46
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   boolean s[]=new boolean[n+1];
   for(int i=2;i<=n;i++)
   {
    s[i]=true;
   }
   for(int i=2;i<=n;i++)
   {
    if(s[i]==true&&i==Math.sqrt(n))
    {
    for(int j=i*i;j<=n;j=j+1)
    {
        s[j]=false;
    }
   }
}
for(int i=2;i<=n;i++)
{
    if(s[i]==true)
    {
        System.out.println(i+" is a prime number");
    }
}
 
  
 

    }
}




// leetcode
class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=start+2*i;

        }
        int sum=arr[0];
        for(int i=1;i<n;i++)
        {
            sum^=arr[i];
        }
        return sum;
    }
}

class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for(int i=0;i<nums.length;i++){
            element_sum+=nums[i];

            int val = nums[i];
            int x;
            
            while(val>0){
                x = val%10;
                digit_sum +=x;
                val = val/10;
            }
        }
        return Math.abs(element_sum - digit_sum);
    }
}
