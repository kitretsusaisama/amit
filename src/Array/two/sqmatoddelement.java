package Array.two;
import java.util.*;
public class sqmatoddelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int maxr,maxc,r,c;
        maxc=maxr=2;
        int mat[][]=new int[maxr][maxc];
        System.out.println("Enter the element of sq matrix: ");
        for (r=0;r<maxr;r++){
            for(c=0;c<maxc;c++)
            {
                mat[r][c]=s.nextInt();
            }
        }

        System.out.println("Print the element of sq matrix: ");
        for (r=0;r<maxr;r++){
            for(c=0;c<maxc;c++)
            {
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }

        System.out.println("Odd Elements:");
        for (r=0;r<maxr;r++){
            for(c=0;c<maxc;c++)
            {
                if (r==c) {
                    if (mat[r][c] % 2 != 0) {
                        System.out.print(mat[r][c] + " ");
                    }
                }
            }
            System.out.println();
        }

    }
}
