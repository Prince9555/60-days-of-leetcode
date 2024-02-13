import java.util.*;
public class dec_bin {
    public static void decTobin(int n){
        int pow=0,binNum=0;
        int mynumber=n;
        while(n>0)
        {
            int rem=n%2;
           binNum=binNum+(rem*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
        
        }
        System.out.println("binary number of    "+  mynumber+"    is equal  "+   binNum);
    }
    public static void main(String [] args)
    {
        decTobin(7);
        decTobin(15);
        decTobin(32);
        decTobin(64);
        decTobin(128);
    }
}
