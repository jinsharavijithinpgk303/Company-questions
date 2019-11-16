package Company;
import java.util.Scanner;
public class Changethecaeofalphabet {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the string:");
     String a = s.next();
     char C = a.charAt(0);
     if(C>65 && C<90)
     {
    	 String abc = a.toLowerCase();
    	 System.out.println(abc);
     }
    if(C>97 && C<122)
     {
    	 String abc = a.toUpperCase();
    	 System.out.println(abc);
     }
    	 
    	 

}
}

