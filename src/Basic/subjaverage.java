//WAP to accept five subjects marks & cal avg.
package Basic;
import java.util.Scanner;

public class subjaverage {
    public static void main(String []ashu)
    {
        int s1,s2,s3,s4,s5,a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st Subject Marks:- ");
        s1=input.nextInt();
        System.out.println("Enter the 2nd Subject Marks:- ");
        s2=input.nextInt();
        System.out.println("Enter the 3rd Subject Marks:- ");
        s3=input.nextInt();
        System.out.println("Enter the 4th Subject Marks:- ");
        s4=input.nextInt();
        System.out.println("Enter the 5th Subject Marks:- ");
        s5=input.nextInt();
        a=(s1+s2+s3+s4+s5)/5;
        System.out.println("Avg of 5 Subjects: "+a);
    }
}
