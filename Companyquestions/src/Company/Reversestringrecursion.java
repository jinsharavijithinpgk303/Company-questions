package Company;
import java.io.StringReader;
import java.util.Scanner;
public class Reversestringrecursion {
	 public static void reverseString(char[]ch, int length)
	   {
	      if (length>0)
	      {
	         System.out.print(ch[length-1]);
	         length--;
	     
	         reverseString(ch,length);
	      }
	   }
	   public static void main(String[] args) 
	   {
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter the String");
	  
	      String str = s.nextLine();
	  
	      char[] ch = str.toCharArray();
	      int length = ch.length;
	               
	      reverseString(ch, length);
	   }
}

  
	