package Array.one;
import  java.util.Scanner;
public class duplicateelements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j;
        int arr[] = new int[10];
        System.out.println("Enter the element of Array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("=> " + i + " : ");
            arr[i] = s.nextInt();
        }
        System.out.println("Duplicate Elements: ");
        for (i = 0; i < 10; i++) {
            for (j=i+1;j<10;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]+"\n");
                }
            }
            System.out.print("=> " + i + " : ");
        }
    }
}
