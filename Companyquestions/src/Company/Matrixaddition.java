package Company;
import java.util.Scanner;
public class Matrixaddition {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int r = s.nextInt();
    System.out.println("Enter the number of columns:");
     int c = s.nextInt();
     int i,j;
     int a[][] = new int[r][c];
     
     int b[][] = new int[r][c];
     int d[][] = new int[r][c];
     
     for(i=0;i<r;i++)
     {
    	 for(j=0;j<c;j++)
    	 {
    		a[i][j]= s.nextInt(); 
    	 }}
    	 for(i=0;i<r;i++)
         {
        	 for(j=0;j<c;j++)
        	 {
        		 b[i][j] = s.nextInt();
        	 }
         }
     
     for(i=0;i<r;i++)
     {
    	 for(j=0;j<c;j++)
    	 {
    		 d[i][j] = a[i][j]+b[i][j];
    		 System.out.println(d[i][j]+" ");
    	 
    	 System.out.println();
     }}
     
    
	}}

         
	
