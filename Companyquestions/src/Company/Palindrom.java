package Company;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int reverse=0;
    int num=s.nextInt();
    int n = num;
    while(num != 0) {
       int digit = num % 10;
       reverse = reverse * 10 + digit;
       num = num/10;
   }
System.out.println(reverse);
if(n==reverse)

{
System.out.println("palindrom");
}
else
{
System.out.println("not palindrome");
}


	}

}
