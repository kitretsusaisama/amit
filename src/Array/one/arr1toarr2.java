package Array.one;
import java.util.Scanner;

public class arr1toarr2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        int arr[] = new int[10];
        int arr2[] = new int[10];
        System.out.println("Enter the element of Array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("=> " + i + " : ");
            arr[i] = s.nextInt();
        }
        for (i=0;i<arr.length;i++){
            arr2[i]=arr[i];
            System.out.println(arr2[i]+" ");
        }
    }
}
