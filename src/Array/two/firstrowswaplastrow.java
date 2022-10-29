package Array.two;
import java.util.*;
public class firstrowswaplastrow {
    public static void main(String kk[])
    {
        Scanner ob=new Scanner(System.in);
        int r1,c1,r,c,temp=0;
        System.out.print("enter the row-order of first matrix: ");
        r1=ob.nextInt();
        System.out.print("enter the col-order of first matrix: ");
        c1=ob.nextInt();
      /*   System.out.print("enter the row-order of second matrix: ");
        //   r2=ob.nextInt();
        // System.out.println("enter the col-order of second matrix: ");
        // c2=ob.nextInt();
   if(c1!=r2){
        System.out.println("Error! Matrix ");
    }*/
        int mat[][]=new int[r1][c1];
        System.out.print("Enter the elements of matrix: ");
        for (r=0;r<r1;r++){
            for (c=0;c<c1;c++)
            {
                System.out.print(mat[r][c]+": ");
                mat[r][c]= ob.nextInt();
            }
        }
        System.out.print("Enter the elements of matrix: ");
        for (r=0;r<r1;r++){
            for (c=0;c<c1;c++)
            {
                temp=mat[0][c];
                mat[r1-1][c]= mat[0][c];
                temp=mat[r1-1][c];

            }
        }
        for (r=0;r<r1;r++){
            for (c=0;c<c1;c++)
            {
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }

}
