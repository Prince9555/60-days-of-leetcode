
public class Solution extends GuessGame {
    public int guessNumber(int n) {
            long s=0;
            long e=n;
            long mid=(s+e)/2;
            while(s<=e){
                  mid=(s+e)/2;
                  int temp=guess((int)mid);
                  if(temp==0)
                    return (int)mid;
                  else if(temp==1)
                     s=mid+1;
                  else 
                     e =mid-1;             
            }  
            return (int)mid;
    }
}