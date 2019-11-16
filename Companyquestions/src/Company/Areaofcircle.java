package Company;
import java.util.Scanner;
public class Areaofcircle {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double radius;
    double area;
    System.out.println("Enter the radius of the circle:");
    radius = s.nextDouble();
    area = (radius*radius)*Math.PI;
    System.out.println("Area of the circle is:"+area);
    
	}

}

