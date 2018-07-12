import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        int[] a={10,20,30,50,40};
	int c,d;
        for(int i=0;i<a.length-1;i++){
		while(a[i+1]>0){
         	  c=a[i]/a[i+1];
		  d=a[i]-c*a[i+1];
         	  a[i]=a[i+1];
	  	  a[i+1]=d;
        	}
	a[i+1]=a[i];
	}
        System.out.println(a[a.length-1]);

}
}
