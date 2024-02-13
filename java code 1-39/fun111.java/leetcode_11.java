
//question number leetcode 69


class Solution {
    public int mySqrt(int x) {
        int answ=(int)Math.sqrt(x);
        return answ;
    }
}


//question number leetcode 29
class Solution {
    public int divide(int dividend, int divisor) {
        long ans=(long)dividend/(long)divisor;
         if(ans > (long)Math.pow(2,31)-1) ans = (long)Math.pow(2,31)-1;
        if(ans < (-1)*(long)Math.pow(2,31)) ans = (long)Math.pow(-2,31);
        return (int)ans;
        
    }
}



    //question number leetcode 9 
    class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
              return false;
        }    
         int rem=0;
         int sum=0;
         int temp=x;
         while(x>0){
           rem=x%10;
           sum=(sum*10)+rem;
           x=x/10;
          }
        if(temp==sum){
        return true;
        }
        return false;
      }
  }


