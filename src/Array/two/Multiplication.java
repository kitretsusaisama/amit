package Array.two;
import java.util.Scanner;

public class Multiplication {

    public static void main(String args[]) {
        int maxrow1, maxcol1, maxrow2, maxcol2;
        Scanner s = new Scanner(System.in);

        // Input dimensions of First Matrix: A
        System.out.print("Enter number of rows in first matrix: ");
        maxrow1 = s.nextInt();

        System.out.print("Enter number of columns in first matrix: ");
        maxcol1 = s.nextInt();

        // Input dimensions of second matrix: B
        System.out.print("Enter number of rows in second matrix: ");
        maxrow2 = s.nextInt();

        System.out.print("Enter number of columns in second matrix: ");
        maxcol2 = s.nextInt();

        // Requirement check for matrix multiplication
        if (maxcol1 != maxrow2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int a[][] = new int[maxrow1][maxcol1];
        int b[][] = new int[maxrow2][maxcol2];
        int c[][] = new int[maxrow1][maxcol2];

        // Input the values of matrices
        System.out.println("\nEnter values for matrix A : ");
        for (int i = 0; i < maxrow1; i++) {
            for (int j = 0; j < maxcol1; j++) a[i][j] = s.nextInt();
        }
        System.out.println("\nEnter values for matrix B : ");
        for (int i = 0; i < maxrow2; i++) {
            for (int j = 0; j < maxcol2; j++) b[i][j] = s.nextInt();
        }

         System.out.println("\nMatrix multiplication is : ");
        for (int i = 0; i < maxrow1; i++) {
            for (int j = 0; j < maxcol2; j++) {
                c[i][j] = 0;

                // Dot product calculation
                for (int k = 0; k < maxcol1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
