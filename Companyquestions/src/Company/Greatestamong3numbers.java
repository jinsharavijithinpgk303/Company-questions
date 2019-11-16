package Company;
import java.util.Scanner;
public class Greatestamong3numbers {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int y = s.nextInt();
    int z = s.nextInt();
    if(x>y && x>z)
    {
    	System.out.println("First number is largest");
    }
    else if(y>x && y>z)
    {
    	System.out.println("Second number is largest");
    }
    else
    {
    	System.out.println("Third number is largest");
    }
	}

}
