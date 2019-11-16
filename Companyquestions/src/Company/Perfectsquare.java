package Company;
import java.util.Scanner;
public class Perfectsquare {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int p = (int)Math.sqrt(n);
      int q = p*p;
      if(q==p)
      {
    	  System.out.println("Perfect Square");
      }
      else
      {
    	  System.out.println("Not Perfect Square");
      }
	}

}
