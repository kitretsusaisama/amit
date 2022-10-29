//WAP accept principal,rate and time from user & cal si
package Basic;
import java.util.Scanner;
public class simpleintrest {
    public static void main(String ashu[])
    {
        int p,t,r,si;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Princpal: ");
        p=input.nextInt();
        System.out.println("Enter your time: ");
        t=input.nextInt();
        System.out.println("Enter your Rate: ");
        r=input.nextInt();
        si=(p*r*t)/100;
        System.out.println("SI: "+si);
    }

}
