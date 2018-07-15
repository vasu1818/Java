class OuterClass{
    public void fun(int a,int b, int c, int d){						//Function with 4 arguments
        System.out.println("Function 4 arguments\nSum is "+(a+b+c+d));
    }
    public void fun(int a,int b, int c){						//Function with 3 arguments
        System.out.println("Function 3 arguments\nSum is "+(a+b+c));
    }
    public void fun(int a,int b){							//Function with 2 arguments
        System.out.println("Function with 2 arguments\nSum is "+(a+b));
    }
    public void varArgs(int ...a){							//Accepts any no. of arguments
        int sum=0;
		for(int i: a)								//i stores elements of a	
            sum=sum+i;									//Adds all elements of a
        System.out.println("Function with Variable Arguments\nSum is "+sum);
    }
}
