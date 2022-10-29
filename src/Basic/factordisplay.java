package Basic;
import java.io.*;
public class factordisplay {
    public static void main(String[] args)throws IOException {
        int i,j,f=1;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        for (i=5;i>=1;i++);
        {
                f=f*i;

        }
        System.out.println("\n"+f);
    }
}
