package Company;
import java.util.Scanner;
public class Decrypt {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter string:");
     String str = s.nextLine();
     int i;
     for(i=0;i<str.length();i++)
     {
   	  int C = str.charAt(i);
   	  C= C-2;
   	  char d = (char)C;
   	  System.out.println(d);
   	  
     }
	}

}

	


