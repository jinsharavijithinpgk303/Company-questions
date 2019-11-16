package Company;
import java.util.Scanner;
public class Arclength {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter angle:");
     int n = s.nextInt();
     System.out.println("Enter radius:");
     int r = s.nextInt();
     double c = 2*3.14*r*n/360;
     System.out.printf("%f",c);
	}

}
