class OuterClass{
    public void fun(int a,int b, int c, int d){
        System.out.println("Function 4 arguments\nSum is "+(a+b+c+d));
    }
    public void fun(int a,int b, int c){
        System.out.println("Function 3 arguments\nSum is "+(a+b+c));
    }
    public void fun(int a,int b){
        System.out.println("Function with 2 arguments\nSum is "+(a+b));
    }
    public void varArgs(int ...a){
        int sum=0;
	for(int i: a)
            sum=sum+i;
        System.out.println("Function with Variable Arguments\nSum is "+sum);
    }
}