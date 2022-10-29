package Loop;

import java.util.Scanner;

public class SpecialNumberChk {
    static int fact(int n){
        int f=1;
        for (;n!=0;n--){
            f=f*n;
        }
        return f;
    }
    static void chk(int n){
        int sum,temp=n;
        for(sum=0;n!=0;n=n/10) {
            sum = sum + fact(n % 10);
        } if (sum==n){
                System.out.println(n+" Special Number");
            }
            else
                System.out.println("Error");
        }

    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num");
        n= s.nextInt();
        chk(n);
    }
}
