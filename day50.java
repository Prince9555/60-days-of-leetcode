import java.util.*;
public class day50 {

    public static boolean issorted(int arr[],int n)
    {
        if(n==arr.length-1)
        {
            return true;
        }
        if(arr[n]>arr[n+1])
        {
            return false;
        }
        return issorted(arr, n+1);
    }


    public static int firstocc(int arrr[],int i,int key)
    {
            if(i==arrr.length-1)
            {
                return -1;
            }
            if(arrr[i]==key)
            {
                return i;
            }
            return firstocc(arrr, i+1, key);
    }


    public static int lastocc(int arrr[],int key,int i)
    {
        if(i==arrr.length-1)
            {
                return -1;
            }
           int isfound=lastocc(arrr, key, i+1);
           if(isfound==-1&&arrr[i]==key)
           {
            return i;
           }
           return isfound;

    }

    public static int  pow(int num,int isto)
    {
      if(isto==0)
     {
      return 1;
        }
        return  num*pow(num, isto-1);

    
    }

    public static int  optimisedpow(int num,int isto)
    { 
  if(isto==0)
  {
    return 1;
  }
  int hals=optimisedpow(num, isto/2);
  int half=hals*hals;


  if(isto%2!=0)
  {
    half=half*num;
  }

  return half;

    }

    public static int tilling(int n)
    {
       if(n==0||n==1)
        {
             return 1;
        }
        int verical=tilling(n-1);
        int horizonal=tilling(n-2);
        int total=verical+horizonal;
        return total;


    }




    public static void main(String[] args) {
        

       // int arr[]={1,2,5,6,9};
        int arrr[]={8,3,6,9,5,10,2,5,3};
       // System.out.println(issorted(arr,0));
      // System.out.println(lastocc(arrr, 5,0));
      //System.out.println(optimisedpow(2, 10));
      System.out.println(tilling(3));
    }
    
}


//leetcode
/* 

class Solution {
           public static String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] cnt = new int[26];
        boolean[] inStack = new boolean[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            cnt[ch - 'a']--;
            if (inStack[ch - 'a']) {
                continue;
            }
            while (!stack.empty() && stack.peek() > ch) {
                if (cnt[stack.peek() - 'a'] <= 0) {
                    break;
                }

                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            inStack[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder(stack.size());
        while (!stack.empty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }}*/