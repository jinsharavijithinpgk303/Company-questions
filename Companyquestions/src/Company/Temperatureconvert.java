package Company;
import java.util.Scanner;
public class Temperatureconvert {

	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   float cen;
   double fah;
	
   System.out.print("Enter Temperature in Centigrade : ");
   cen = s.nextFloat();
	
   fah = (1.8*cen) + 32;
	
   System.out.print("Equivalent Temperature in Fahrenheit = " + fah);
}
}
	







