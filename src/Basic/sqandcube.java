package Basic;
import java.util.Scanner;

public class sqandcube{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter a Num to Find the Sq & Cube : ");
        n=s.nextInt();
        System.out.println("Square"+Math.pow(n, 2));
        System.out.println("Cube"+Math.pow(n, 3));
    }
}