package Company;
import java.util.Scanner;
public class Hypotenuse {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the first number");
     int x = s.nextInt();
     System.out.println("Enter the second number");
     int y = s.nextInt();
     System.out.println("The hypotenuse is :"+Math.hypot(x, y));
	}

}
