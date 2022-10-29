package Basic;
import java.util.*;
public class avgmaxandmin {
    public static void main(String[] args) {
      // InputStreamReader inlink=new InputStreamReader(System.in);
       // BufferedReader input=new BufferedReader(inlink);
        Scanner input=new Scanner(System.in);
        int i,n,d,maxd,mind;
        System.out.println("Enter a num");
        n= input.nextInt();
        maxd=mind=(i=n%10);
        for (i=n;i>1;i=i/10)
        {
            d=i%10;
            if (d>maxd)
                maxd = d;

            if (d<mind)
                mind = d;

        }
        System.out.println("Print MAxd "+maxd+" Mind "+mind+" ");
    }
}

