package Loop;
import java.util.Scanner;

public class SpecialNumberRangechk {
   static int fact(int n){
       int f;
       for (f=1;n!=0;n--)
       {
           f=f*n;
       }
   return f;
    }
    static void chk(int n) {
        int sum, temp=n;
        for (sum = 0; temp != 0; temp = temp / 10) {
            sum = sum + fact(temp % 10);
         if (sum == n) {
            System.out.println(n + " Special Nums");
        }
    }
   }

    public static void main(String[] args) {
        int r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range "+fact(5));
        r=s.nextInt();
        for (int i=1;i<=r;i++)
        {
            chk(i);
        }
    }
}
