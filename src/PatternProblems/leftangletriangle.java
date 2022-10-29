package PatternProblems;

public class leftangletriangle {
    public static void left(int r){
        int i,j;
        for (i = 0; i < r; i++) {
            for (j = i; j < r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=6;
        left(n);
    }
}
