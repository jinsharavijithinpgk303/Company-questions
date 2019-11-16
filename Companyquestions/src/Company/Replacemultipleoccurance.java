package Company;
import java.util.Scanner;
public class Replacemultipleoccurance {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the size:");
     int n = s.nextInt();
     String str = s.nextLine();
     int i=0;
     int j=0;
     char arr[]=new char[n];
     while (i<str.length()-1) {            
         if(str.charAt(i)!=str.charAt(i+1)){
             arr[j]=str.charAt(i);
             i++;
             j++;
         }else{
             i++;
         }
     }
     arr[j]=str.charAt(str.length()-1);
     for(char c:arr){
         System.out.print(c);
     }
 }

	}


