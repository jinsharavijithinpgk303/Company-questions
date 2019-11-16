package Company;
import java.util.Scanner;           
public class Vowels {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any Character:");
    char c= s.next().charAt(0);
    if(c=='a' || c=='A' ||c=='E'||c=='e'||c=='i'|| c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
    {
    	System.out.println("VOWELS");
    }
    else
    {
    	System.out.println("CONSONENTS");
    }
	}

}
