package Company;
import java.util.Scanner;
public class Sumofdigits {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum=0,a;
    System.out.println("Enter a number:");
    int n = s.nextInt();
    while(n>0) 
    {
    	a = n%10;
    	sum = sum+a;
    	n = n/10;
    }
    System.out.println(sum);
	}

}
