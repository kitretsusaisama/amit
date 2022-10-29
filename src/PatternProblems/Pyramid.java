package PatternProblems;
public class Pyramid {

    public static void pattern(int r){
        int i, j;
        for (i = 0; i < r; i++) {
            for (j = r - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        for (i = 0; i <=r; i++) {
            for (j = i; j <=r; j++) {
                System.out.print(" ");
            }
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     int n=5;
     pattern(n);
    }
}

