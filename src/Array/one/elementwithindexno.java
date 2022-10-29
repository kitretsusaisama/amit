package Array.one;
import java.util.Scanner;
public class elementwithindexno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        int arr[]=new int[10];
        System.out.println("Enter the element of Array: ");
        for (i=0;i<10;i++){
            System.out.print("=> "+i+" : ");
            arr[i]=s.nextInt();
        }
        System.out.println("Print the element of Array: ");
        for (i=0;i<10;i++){
            System.out.print(arr[i]+" ");
            System.out.print("_- element is at position -_ ");
            System.out.print(i+" ");
            System.out.println();
        }
    }
}
