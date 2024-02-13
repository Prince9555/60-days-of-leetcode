public class i1 {
    
    public static void main(String args[])
    {
        int n=4;
        for(int i=1; i<=4; i++)
        {
            char ch='a';
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
