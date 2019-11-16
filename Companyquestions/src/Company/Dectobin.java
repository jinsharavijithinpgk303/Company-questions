package Company;
import java.util.Scanner;
public class Dectobin {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
   System.out.println("Enter any number");
   int number = s.nextInt();
   int dec = number;
   String bin = Integer.toBinaryString(dec);
   System.out.println(bin);
	}

}
