package Company;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int Number, Temp, Reminder, Sum = 0, i, Factorial;

    System.out.print(" Please Enter any Number : ");
    Number = s.nextInt();

    Temp = Number;
    while( Temp > 0)
    {
    Factorial = 1;
    i = 1;
       Reminder = Temp % 10;
       while (i <= Reminder)
       {
        Factorial = Factorial * i;
        i++;
       }
       System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
        Sum = Sum + Factorial;
        Temp = Temp /10;
    }

    System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);

    if ( Number == Sum )
    {
    System.out.println("\n " + Number + " is a Strong Number");
    }
    else
    {
      System.out.println("\n " + Number + " is Not a Strong Number");
    }



	}

}
