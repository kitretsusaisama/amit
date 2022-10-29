//WAP to accept cost of book from user and provide 10% discount on it.Calculated net amount to be paid.
package Basic;
import java.util.Scanner;

public class discount {
public static void main(String[] amit)
{
    int n,dp,t;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the price of Book:- ");
    n=input.nextInt();
    dp=n*10/100;
    t=n-dp;
    System.out.println("Discount Amt: "+dp);
    System.out.println("Price with Discount: "+t);
}
}
