
     import java.util.Scanner;
    import java.lang.String;
    public class Espionage
    {
    public static void main()
    {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter CODE.");
    Espionage T = new Espionage();
    String code = S.nextLine();
    char C[] = new char[200];
    int r, i, j, h;
    h = 0;
    String CODE = "";
    for(r = 0; r < code.length(); r++)
    CODE = CODE + code.charAt(code.length()-r-1);
    System.out.println(CODE);
    for(i = 0; i < CODE.length()-2; i = i + 3)
    {
    int W = Integer.parseInt(CODE.substring(i, i+3));
    if(W > 99 && W < 123)
    C[h++] = (char)W;
    else if(W == 32)
    C[h++] = (char)W;
    else
    {
    W = Integer.parseInt(CODE.substring(i, i+2));
    C[h++] = (char)W;
    i = i -1;
    }
    }
    for(j = 0; j < h; j++)
    System.out.print(C[j]);
    }
    }

 
