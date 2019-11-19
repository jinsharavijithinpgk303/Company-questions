package patternandseries;
import java.util.Scanner;
public class Alphebeticpattern {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the rows needed:");
    int rows = s.nextInt();
    int alphabet = 65;
    for(int i=0;i<rows;i++)
    {
    	for(int j=0;j<=i;j++)
    	{
            System.out.print((char) alphabet + " ");

    	}
    	alphabet++;
    	System.out.println();
    }
    
 
}
}
