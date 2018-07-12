import java.util.Scanner;
public class OvrldClass {
    public static void main(String[] args) {
        int z=5,b=3,c=8,d=9,n;
        OuterClass o=new OuterClass();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of inputs to be added");
        n=s.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
            a[i]= s.nextInt();
        o.fun(z,b);
        o.fun(z,b,c,d);
        o.fun(z,b,c);
        o.varArgs(a);
    }
}