package Basic;
import java.util.Scanner;
public class siandci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double p,t,i,si,ci;
        System.out.println("Enter Principal Amt: ");
        p=s.nextInt();
        System.out.println("Enter time in year : ");
        t=s.nextInt();
        System.out.println("Enter intrest in % : ");
        i=s.nextInt();
        si=(p*i*t)/100;
        ci=p * Math.pow(1.0+i/100.0,t) - p;
        System.out.println("Simple Intrest : "+si);
        System.out.println("Compound Intrest : "+ci);
    }
    
}
