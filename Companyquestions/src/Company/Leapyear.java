package Company;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the year:");
    int year = s.nextInt();
           
    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
    else
            System.out.println("Year " + year + " is not a leap year");
            //System.out.println();
 }

}