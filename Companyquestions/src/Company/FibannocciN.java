package Company;
import java.util.Scanner;
public class FibannocciN {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a =0,b=1;
    int n = s.nextInt();
    System.out.printf("%d %d ",a,b);
    for(int i=0;i<n-2;i++)
    {
    int c = a+b;
    System.out.printf("%d ",c);

     
    	a=b;
    	b=c;
    	
	}
	}
}
