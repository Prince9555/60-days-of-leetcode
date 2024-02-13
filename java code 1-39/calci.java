import java.util.*;
public class calci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a =sc.nextInt();
        System.out.println("enter the for b:");
        int b =sc.nextInt();
        System.out.println(" ENTER THE OPERATOR +,-,/,*,%");
        char op=sc.next().charAt(0);
         
        switch(op)
        {
            case '+':System.out.println(a+b); 
                         break;
            case '-':System.out.println(a-b); 
                         break;
            case '/':System.out.println(a/b); 
                         break;
            case '*':System.out.println(a*b); 
                         break;
            case '%':System.out.println(a%b); 
                         break;
            default: System.out.println("Wrong operator");
        }
    }
    }

