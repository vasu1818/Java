import java.util.Scanner;                       //Scanner Class
public class Calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter 1st no.");
            a=s.nextInt();
            System.out.println("Enter 2nd no.");
            b=s.nextInt();
            if(a<0 || b<0){
                System.out.println("\nEnter proper numbers!!");
                continue;
            }
            System.out.println("Enter your operation to pe performed (+,-,*,/)");
            char c=s.next().charAt(0);
            if(c!='/' && c!='*' && c!='+' && c!='-')
                System.out.println("\nEnter proper operator!!");
            if(b==0 && c=='/')
                System.out.println("Infinity");
            }while(a<0 || b<0);                     //It wont accept any negative value and invalid operators
        
        switch(c){                                  //switch cases according to operators
            case '+':{
                int ans=a+b;
                System.out.println("sum of numbers is "+ans);               //Addition
                break;
            }
            case '-':{
                int ans=a-b;
                System.out.println("subtraction of numbers is "+ans);       //Subtraction
                break;
            }
            case '*':{
                int ans=a*b;
                System.out.println("Multiplication of numbers is "+ans);    //Multiplication
                break;
            }
            case '/':{
                int ans=a/b;
                System.out.println("Divion of numbers is "+ans);            //Division
                break;
            }
        }
}
}
