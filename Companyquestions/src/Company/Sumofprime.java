package Company;
import java.util.Scanner;
public class Sumofprime {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int s1,s2,i,j,count,sum=0;
     System.out.println("Enter the lower limit");
     s1 = s.nextInt();
     System.out.println("Enter the upper limit");
     s2 = s.nextInt();
     for( i=s1;i<=s2;i++)
     {
    	 count=0;
    	 for(j=2;j<i;j++)
    	 {
    		 if(i%j==0)
    		 {
    			 count++;
    			 break;
    		 }
    	 }
    	 if(count==0 && i!=1)
    	 {
    		 sum = sum+i;
    	 }
     }
     System.out.println(sum);
     
	}

}
