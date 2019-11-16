package Company;
import java.util.Scanner;
public class Maximumelement {

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n,i,max=0;
       System.out.println("Enter the number of elements in array:");
       n = s.nextInt();
       int a[] = new int[n];
       System.out.println("Enter the elements in array:");
       for(i=0;i<n;i++)
       {
    	   a[i] = s.nextInt();
       }
       max = a[0];
       for(i=0;i<n;i++)
       {
    	   if(max<a[i])
    	   {
    		   max = a[i];
    	   }
       }
       System.out.println("Maximum value:"+max);
	}
}