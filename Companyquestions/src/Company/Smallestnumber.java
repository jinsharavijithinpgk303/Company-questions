package Company;
import java.util.Scanner;
public class Smallestnumber {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int a[] = new int[n];
      int i,j,small=0;
      for(i=0;i<n;i++)
      {
    	  a[i] = s.nextInt();
    	   small = a[0];
    	   if(small>a[i])
    	   {
    		   small = a[i];
    	   }
    		   
    	   }
      System.out.println(small);
      }
	}


