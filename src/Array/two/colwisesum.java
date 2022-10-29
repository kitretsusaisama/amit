package Array.two;
import java.util.*;
public class colwisesum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int maxr,maxc,r,c,ui,avg;
        maxc=maxr=2; //define limit
        int mat[][]=new int[maxr][maxc];
        System.out.println("Enter the element of matrix: ");
        for (r=0;r<maxr;r++){
            for(c=0;c<maxc;c++)
            {
                mat[r][c]=s.nextInt();
            }
        }
        System.out.println("Print the element of matrix: ");
        for (r=0;r<maxr;r++){
            for(c=0;c<maxc;c++)
            {
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Col- wise Sum of MAtrix");
        for(r=0;r<maxr;r++)
        {
            int sum=0;
            for(c=0,ui=0;c<maxc;c++)
            {
                sum+=mat[c][r];//change here for row or col addition.
                ui++;
            }
            avg=sum/ui;
            System.out.print(avg+" ");
        }

    }
}
