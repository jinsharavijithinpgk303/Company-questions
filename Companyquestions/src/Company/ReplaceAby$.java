package Company;

import java.util.Scanner;

public class ReplaceAby$ {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter a string");
		String str=s.nextLine();
		int i=0;
	
		for( i=0;i<str.length();i++)
		{
			char vb=str.charAt(i);
			
			if (vb=='a'||vb=='A')

			{
				System.out.print(" $");
			}
			else
			{
				System.out.print(vb);
			}
				

	}

}}
