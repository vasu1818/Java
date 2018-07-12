
public class Overload {
    public void fun(int a,int b, int c, int d){
        System.out.println("function 4 arguments\n sum is "+(a+b+c+d));
    }
    public void fun(int a,int b, int c){
        System.out.println("function 3 arguments\n sum is "+(a+b+c));
    }
    public void fun(int a,int b){
        System.out.println("function with 2 arguments\n sum is "+(a+b));
    }
    
    public static void main(String[] args) {
        int a=5,b=3,c=8,d=9;
        Overload o=new Overload();
        o.fun(a,b);
        o.fun(a,b,c,d);
        o.fun(a,b,c);
    }
}
