import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        
        for (int i = 1; i < n; i++) {
            if (gcd(i, n) == 1) {
                c++;
            }
        }
        System.out.println(c);
         
    }
    
    public static int gcd(int a, int b) {
        if (a == 0) {
            return a;
        }
        
        return gcd(b%a,a);
    }
}


//leetcode

class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
            if(count == k) {
                s = s.substring(0, i);
                break;
            }            
        }
        return s;
    }
}