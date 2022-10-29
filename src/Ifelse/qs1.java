package Ifelse;
import java.io.*;
public class qs1 {
    public static void main(String[] args)throws IOException {
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader bi= new BufferedReader(input);
        int s,sincm,n;
        System.out.println("Enter Total sales income of a person:\n");
        sincm=Integer.parseInt(bi.readLine());
        if (sincm>50000){
            n=(sincm*16)/100;
            s=375+n;
            System.out.println("Total Monthly Income of a person is "+s);
        }
        else if (sincm<50000 && sincm>40000)
        {
            n=(sincm*14)/100;
            s=370+n;
            System.out.println("Total Monthly Income of a person is "+s);
        }
        else if (sincm<40000 && sincm>30000)
        {
            n=(sincm*12)/100;
            s=325+n;
            System.out.println("Total Monthly Income of a person is "+s);
        }
        else if (sincm<30000 && sincm>20000)
        {
            n=(sincm*9)/100;
            s=300+n;
            System.out.println("Total Monthly Income of a person is "+s);
        }
        else if (sincm<20000 && sincm>10000)
        {
            n=(sincm*5)/100;
            s=250+n;
            System.out.println("Total Monthly Income of a person is "+s);
        }
        else
        {
            System.out.println("Better Luck Next Time");
        }
    }
}
