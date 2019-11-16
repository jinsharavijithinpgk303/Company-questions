package Company;

import java.util.Scanner;

public class Countwovel {

	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		int i=0,count=0,digit=0,vowel=0,con=0,space=0,symbol=0;
		
for(i=0;i<str.length();i++)
{
	if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')

	{
		vowel++;
	}
		
	}
		
System.out.printf("vowel=%d ",vowel);
	}

}
