package Basic;

public class findlargeinthree {
    public static void main(String[] args) {
        int n1=987,n2=5,n3=4,mn=0;
        if (n1>n2)
        {
            mn=n1;
        }
        else if (n2>n3)
        {
            mn=n2;
        }
        else if (n3>n1)
        {
            mn=n3;
        }
        System.out.println(mn);
    }
}
