//Write a program to cal the quotient and remainder.
package Basic;
import java.util.Scanner;

public class Divide {
    public static void main(String amit[])
    {
        int divisor,dividend,q,r;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Dividend Num: ");
        dividend=input.nextInt();
        System.out.println("Enter your Divisor Num: ");
        divisor=input.nextInt();
        q=dividend/divisor;
        r=dividend%divisor;
        System.out.println("Result of Cal For \nDividend = "+dividend+"\t|\tDivisor = "+divisor+"\nQ= "+q+"\t|\tR= "+r);
    }
}
