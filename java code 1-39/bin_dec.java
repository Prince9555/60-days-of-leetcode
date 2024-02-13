public class bin_dec {
    public static void bin_de(int n)
    {
        int pow=0,dec=0;
        int mynumber=n;
        while(n>0)
        {
            int ld=n%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            n=n/10;
            pow++;
        
        }
        System.out.println("decimal number of    "+  mynumber+"    is equal      "+   dec);
    }
    public static void main(String [] args)
    {
        bin_de(1111);
        bin_de(10001);
        bin_de(10001);
        bin_de(10001);
    }
}
