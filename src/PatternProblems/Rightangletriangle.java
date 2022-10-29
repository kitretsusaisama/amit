package PatternProblems;

public class Rightangletriangle {
    public static void right(int r) {
        int i, j;
        for (i = 0; i < r; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        right(n);
    }
}
