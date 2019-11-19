package patternandseries;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the rows needed:");
   int n = s.nextInt();
   int i,j;
   for(i=0;i<n;i++)
   {
	   System.out.println("");
  
   for(j=n;j>i;j--)
   {
   System.out.print("*");
	}
  s.close();
}  
}
}

