package patternandseries;
import java.util.Scanner;
public class Ailhebeticpattern1 {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the rows needed:");
    int n = s.nextInt();
    int alphabet = 65;
    for(int i=0;i<=n;i++)
    {
    	for(int j=0;j<=i;j++)
    	{
    		System.out.print((char)(alphabet)+" ");
    	
    	alphabet++;
    	}
    	System.out.println();
    }
    
	}

}
