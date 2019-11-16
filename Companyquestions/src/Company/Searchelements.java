package Company;
import java.util.Scanner;
public class Searchelements {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int flag=0;
   
    System.out.println("Enter the element:");
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i] = s.nextInt();
    	
    }
    System.out.println("Enter the element:");
    int k = s.nextInt();
    for(int i=0;i<n;i++)
    {
    	
    	if(arr[i]==k)
    	{
    		flag=1;
    }
    
    else
    {
    	flag=0;
    }
	}
    if(flag==1)
    System.out.println("Found");
    else
	{
		System.out.println("Not found");
	}

}
}
