import java.util.Scanner;
public class OvrldClass {
    public static void main(String[] args) {
        int z=5,b=3,c=8,d=9,n;
        OuterClass o=new OuterClass();                      //OuterClass is class stored in another file  
        Scanner s = new Scanner(System.in);                 //We cann access that class if that file containing is in the same directory 
        System.out.println("Enter no. of inputs to be added");
        n=s.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
            a[i]= s.nextInt();
        o.fun(z,b);                                         //Method of OuterClass with 2 argument
        o.fun(z,b,c,d);                                     //Method of OuterClass with 4 argument
        o.fun(z,b,c);                                       //Method of OuterClass with 3 argument
        o.varArgs(a);                                       //Method of OuterClass which accepts any no. of arguments
    }
}
