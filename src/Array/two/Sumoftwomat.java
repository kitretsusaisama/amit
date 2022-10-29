package Array.two;

import java.util.Scanner;

public class Sumoftwomat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,j,maxr=3,maxc=2;
        int mat1[][]=new int[maxr][maxc];
        int mat2[][]=new int[maxr][maxc];
        int sum[][]=new int[maxr][maxc];
        System.out.println("Enter the element of matrix 1st: ");
        for (i=0;i<maxr;i++){
            for (j=0;j<maxc;j++)
            {
                //System.out.print("\t"+mat[i][j]+" : ");
                mat1[i][j]= input.nextInt();
            }
        }
        System.out.println("Enter the element of matrix 2nd: ");
        for (i=0;i<maxr;i++){
            for (j=0;j<maxc;j++)
            {
                //System.out.print("\t"+mat[i][j]+" : ");
                mat2[i][j]= input.nextInt();
            }
        }
        System.out.println("Display the elements of matrix: ");
        for (i=0;i<maxr;i++){
            for (j=0;j<maxc;j++)
            {
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
