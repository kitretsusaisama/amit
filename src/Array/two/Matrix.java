package Array.two;
import java.util.*;

public class Matrix {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int i,j,maxr=3,maxc=2;
    int mat[][]=new int[maxr][maxc];
        System.out.println("Enter the element of matrix: ");
        for (i=0;i<maxr;i++){
            for (j=0;j<maxc;j++)
            {
                //System.out.print("\t"+mat[i][j]+" : ");
                mat[i][j]= input.nextInt();
            }
        }
        System.out.println("Display the elements of matrix: ");
        for (i=0;i<maxr;i++){
            for (j=0;j<maxc;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

//Folder ownership belongs to shivam singhaniya ,victor_amit & his team members.

