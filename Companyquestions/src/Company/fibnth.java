package Company;
import java.util.Scanner;
public class fibnth {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int a =0,b=1;
    int c=0;
     int n = s.nextInt();
    // System.out.printf("%d %d ",a,b);
     for(int i=0;i<n-2;i++)
     {
      c = a+b; b
     

      
     	a=b;
     	b=c;
     	
 	}
     System.out.printf("%d ",c);
 	}
 

	}


