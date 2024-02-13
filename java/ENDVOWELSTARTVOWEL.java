
 import java.util.StringTokenizer;
import java.io.*;
 class ENDVOWELSTARTVOWEL {
    public static void main(String a[])throws IOException
    {
        int i,k ,m, n, f1, f2;
        char w1, w2;
        i = 0;
        m = 0;
        n = 0;
        f1 = f2= 0;
       
        String st, word;
        String words[] = new String[20];
        String wordWithEndBeginVowel[] = new String[10];
        String wordWithoutEndBeginVowel[] = new String[10];
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter a sentence:");
        st=br.readLine();
        StringTokenizer st1 = new StringTokenizer(st,". , ? !");

        while(st1.hasMoreTokens())
        {
            word = st1.nextToken();
            words[i]=word;
            i++;
        }
      
        for(k=0; k<i; k++)
        {
            f1 = f2 = 0;
            switch(words[k].charAt(0))
            {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                f1 = 1;
               
            }
           
            switch(words[k].charAt((words[k].length())-1))
            {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                f2=1;
                
            }
            if(f1==1 && f2==1)
            {
                wordWithEndBeginVowel[m]=words[k];
                System.out.println(words[k]);
                m++;
               
            }
            else
            {
                wordWithoutEndBeginVowel[n]=words[k];
                n++;
            }

        }
        System.out.println("Total Words Begin and End with Vowels="+m);
        System.out.println("Words Begin and End with Vowels");
        for(i=0;i<m;i++)
            System.out.println(wordWithEndBeginVowel[i]);
        System.out.println("Words Begin and End without Vowels+"+n);
        for(i=0; i<n; i++)
            System.out.println(wordWithoutEndBeginVowel[i]);

    }
}