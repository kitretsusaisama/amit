//Find the nth term total 1+2!-3!+4!-5!+6!-7!___ n term.
package Series;
import java.util.Scanner;
public class qs2 {
    public static void main(String[] args) {
        int n,num,i,j,f,sof;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your nth terms: ");
        n=input.nextInt();
        for (i = 1,num=2,sof=1; i<n ; i++) {
            for (j = 1,f=1;j<=num;j++){
                f=f*j;
                if(i%2==0)
                {
                    sof=sof-f;
                }
                else
                    sof=sof+f;
                num++;
            }
        }
        System.out.println("The Sum For Series "+sof);
    }
}
