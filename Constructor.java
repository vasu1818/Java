public class Constructor {
    {
        System.out.println("Inside Instance block");
    }
    static{
        System.out.println("Inside Static block");
    }
    public Constructor() {
        System.out.println("Constructor w/o Arguments");
    }
    public Constructor(int a) {
        System.out.println("Constructor with 1 Arguments");
    }
    public Constructor(int a, int b) {
        System.out.println("Constructor with 2 Arguments");
    }
    public static void main(String[] args) {
        Constructor cons1=new Constructor();
        Constructor cons2=new Constructor(1);
        Constructor cons3=new Constructor(1,2);
}
        
}
