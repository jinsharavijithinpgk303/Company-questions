package Company;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter principle amount:");
   int p = s.nextInt();
   System.out.println("Enter rate:");
    int r = s.nextInt();
    System.out.println("Enter Year:");
   int n = s.nextInt();
   int i = (p*n*r/100);
   int a = (p*n*r/100)+p;
   System.out.println(i);
   System.out.println(a);
	}

}
