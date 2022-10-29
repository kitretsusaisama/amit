package Basic;
import java.util.Scanner;
public class nspecialnumber {
    public static void main(String[] args) {
        int num,n,i,j,d,fod,sofed;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the range: ");
        n=input.nextInt();
        System.out.println("All Special no from 1 to "+n+" are \n");
        for (num=1,sofed=0, fod = 1; num<n ; num++) {
            {
                for (i=num;i>0;i=i/10) {
                    d = i % 10;
                    for (j = 1; j <= d; j++) {
                        fod = fod * j;
                        sofed = sofed + fod;
                    }
                }
            }
            if (sofed == num)
                System.out.println(num + "\t");
        }
    }
}
