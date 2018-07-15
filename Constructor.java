public class Constructor {
    {
        System.out.println("Inside Instance block");                //Instance block executes whenever the object is created
    }
    static{
        System.out.println("Inside Static block");                  //static block executes first and only once
    }
    public Constructor() {
        System.out.println("Constructor w/o Arguments");            //constructor without arguments
    }
    public Constructor(int a) {
        System.out.println("Constructor with 1 Arguments");         //constructor with 1 arguments
    }
    public Constructor(int a, int b) {
        System.out.println("Constructor with 2 Arguments");         //constructor with 2 arguments
    }
    public static void main(String[] args) {
        Constructor cons1=new Constructor();
        Constructor cons2=new Constructor(1);
        Constructor cons3=new Constructor(1,2);
}
        
}
