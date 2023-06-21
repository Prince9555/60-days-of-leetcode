class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
         String x=s.trim();
         for(int i=0;i<x.length();i++)
         {
             if(x.charAt(i)==' ')
             {
                 len=0;
             }
             else{
                 len++;
             }
         }
         return len;
        
    }
}






class Solution {
    public int climbStairs(int n) {

          if(n<3)
          {
              return n;
          }
          int arr[]=new int[n];
          arr[0]=1;
          arr[1]=2;
          arr[2]=3;
          for(int i=3;i<n;i++)
          {
              arr[i]=arr[i-1]+arr[i-2];
          }
          return arr[n-1];
          
    }
        
    
}

 