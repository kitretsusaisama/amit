//WAP to accept two num and interchange their values.
package Basic;
import java.util.Scanner;
public class swapnum {
    public static void main(String[] args) {
        int n1,n2,t;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st Num:- ");
        n1=input.nextInt();
        System.out.println("Enter the 1st Num:- ");
        n2=input.nextInt();
        System.out.println("Before, N1: "+n1+"\t|\tN2: "+n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After, N1: "+n1+"\t|\tN2: "+n2);
    }
}
