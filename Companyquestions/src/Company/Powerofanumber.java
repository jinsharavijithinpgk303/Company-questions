package Company;
import java.util.Scanner;
public class Powerofanumber {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the base number:");
    int a = s.nextInt();
    System.out.println("Enter the exponent number:");
    int b = s.nextInt();
    System.out.println(Math.pow(a, b));
	}

}
