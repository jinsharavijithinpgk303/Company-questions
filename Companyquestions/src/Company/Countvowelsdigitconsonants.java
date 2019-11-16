package Company;

import java.util.Scanner;

public class Countvowelsdigitconsonants {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		int i=0,count=0,digit=0,vowel=0,con=0,space=0,symbol=0;
		//char d=str.charAt(i);
for(i=0;i<str.length();i++)
{
	if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')

	{
		vowel++;
		//System.out.println(vowel);
	}
	else if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')

{
	digit++;
	}
	else if(str.charAt(i)==' ')
		
	{
		space++;
	}
	else if(str.charAt(i)=='@'||str.charAt(i)=='#'||str.charAt(i)=='$'||str.charAt(i)=='&'||str.charAt(i)=='*')
	{
		symbol++;
	}
	else
	{
		con++;
	}
}
System.out.printf("vowel  =%d ",vowel);
System.out.printf("\ndigit =%d ",digit);
System.out.printf("\nconsonants =%d ",con);
System.out.printf("\nsymbolss =%d ",symbol);
System.out.printf("\nspace =%d ",space);

	}
}
