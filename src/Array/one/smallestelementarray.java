package Array.one;

import java.util.Scanner;

public class smallestelementarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        int min=arr[0];
        System.out.println("Enter the element of Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("=> " + i + " : ");
            arr[i] = s.nextInt();
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Element of array "+min);
    }
}
