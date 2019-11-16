package Company;
import java.util.Scanner;
public class Deletevowels {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter input string:");
    String string = s.nextLine();
	System.out.println("Input String : "+string);
	string = string.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(string);
}
}

