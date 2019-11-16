package Company;
import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int i, Number, Sum = 0 ;
			
	System.out.println("\n Please Enter any Number: ");
	Number = s.nextInt();

	for(i = 1 ; i < Number ; i++) {
		if(Number % i == 0)  {
			Sum = Sum + i;
		}
	}
	if (Sum == Number) {
		System.out.format("\n% d is a Perfect Number", Number);
	}
	else {
		System.out.format("\n% d is NOT a Perfect Number", Number);
	}
}

}