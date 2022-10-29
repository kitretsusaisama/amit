//WAP a program to  calculate and print the following(Addition,Substraction,Multiplication)
package Basic;// Because of Directory
import java.util.Scanner;

public class Calculation {
    public static void main(String[] amit){
    int n1,n2,a,s,m;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your 1st Num: ");
    n1=input.nextInt();
    System.out.println("Enter your 2nd Num: ");
    n2=input.nextInt();
    a=n1+n2;
    s=n1-n2;
    m=n1*n2;
    System.out.println("Result of Cal For N1 = "+n1+"| N2 = "+n2+"\nAddition: "+a+"\nSubstraction: "+s+"\nMultiplication: "+m);
    }
}
