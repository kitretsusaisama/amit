//WAP to find the sum of the series (1!+2!+3!+4!+5!+___+n!).
package Series;
import java.util.Scanner;
public class qs1 {
    public static void main(String[] ashu)
    {
        int f=1,i,j,n,sof;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your nth terms: ");
        n=input.nextInt();
        for (i=0,sof=0;i<=n;i++){
            for (j=1;j<=i;j++){
                f=f*i;
                sof=sof+f;
            }
        }
        System.out.println("The sum of the series is 1!+2!+___+"+n+"! is "+sof);
    }
}
