import java.util.Scanner;						//Scanner class
public class GCD {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] a={10,20,30,50,40};
		int c,d;
		for(int i=0;i<a.length-1;i++){			//Finds GCD of first two numbers
			while(a[i+1]>0){					//and then finds GCD of third number and the previous GCD
				c=a[i]/a[i+1];					//and this continues till last number 
				d=a[i]-c*a[i+1];
				a[i]=a[i+1];
				a[i+1]=d;
			}
			a[i+1]=a[i];
		}
			System.out.println(a[a.length-1]);	//Prints final GCD
	}
}
