class Solution {
    public void reverseString(char[] s) {
         int a=0;
         int n=s.length-1;
          while(a<n)
          {
             Character temp= s[a];
             s[a]=s[n];
             s[n]=temp;
             a++;
             n--;

         }
          
          
    }

} 




class Solution {
    public int largestAltitude(int[] gain) {
        int max=-100;
        int currsum=0;
        for(int i=0;i<gain.length;i++)
        {
            currsum=currsum+gain[i];
            max=Math.max(max,currsum);
        }
        if(max>0)
        {
            return max;
        }
        return 0;
    }
}