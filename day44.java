class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = searchFirst(nums, target);
        result[1] = searchLast(nums, target);

        return result;
    }

     private int searchFirst(int[] nums, int target){
        int left = 0; 
        int right = nums.length - 1;  
        int index = -1; 

        while(left <= right){

            int mid = left + (right - left) / 2;  

            if(nums[mid] == target){
                index = mid;  
                right = mid - 1;  
            }

            else if(nums[mid] < target){
                left = mid + 1;  
            }
            else{
                right = mid - 1;  
            }
        }

        return index;
    }

     private int searchLast(int[] nums, int target){
        int left = 0;  
        int right = nums.length - 1;  
        int index = -1;  

        while(left <= right){

            int mid = left + (right - left) / 2;  

            if(nums[mid] == target){
                index = mid;  
                left = mid + 1;  
            }

            else if(nums[mid] < target){
                left = mid + 1;  
            }
            else{
                right = mid - 1;  
            }
        }

        return index;
    }
}





class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[]= new int[nums.length];
        Arrays.fill(arr,-1);
       if(2*k>=nums.length){
            return arr;
        }
        double sum=0;
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
        }
        double avg=sum/(2*k+1);
        arr[k]=(int)avg;
        for(int i=k+1;i<nums.length-k;i++){
            sum-=nums[i-k-1];
            sum+=nums[i+k];
            double a=sum/(2*k+1)*1.0;
            arr[i]=(int)a;
        }
        return arr;
    }
}