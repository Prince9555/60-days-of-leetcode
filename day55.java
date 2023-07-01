 //leetcode
 class Solution {
    public int findNonMinOrMax(int[] nums) {
         Arrays.sort(nums);
         for(int i=0;i<nums.length;i++)
         {
             int min=nums[0];
             int max=nums[nums.length-1];
             if(nums[i]!=min&&nums[i]!=max)
             {
                 return nums[i];
             }
         }
        return -1;
    }
}

//no of even number

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            int sum=0;
            while(x>0)
            {
                int rd=x%10;
                sum++;
                x=x/10;
            }
            if(sum%2==0)
            {
                count++;
            }
        }
        return count;
    }
}

//lletcode find nums[i]==i
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(i % 10 == nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}