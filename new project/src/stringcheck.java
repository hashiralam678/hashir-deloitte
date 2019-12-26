import java.lang.*;
import java.util.*;

class stringcheck
{
	public static void main(String[] args)
	{
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		str = sc.nextLine();
		int count = 0;
		StringBuilder revstr = new StringBuilder(str);
		int len = str.length();
		char ch[] = new char[len];
		
		for(int i = 0; i< len; i++)
		{
			ch[i] = str.charAt(i);
			if(ch[i]=='A' || ch[i]=='a' || ch[i]=='E' || ch[i]=='e'
			    || ch[i]=='I' ||ch[i]=='i' ||ch[i]=='O' || ch[i]=='o' || ch[i]=='U' ||ch[i]=='u')
			{
				count ++;
			}
		}
		if(count == 0)
		{
			System.out.println("no vowels present");
			System.out.println("Reverse of the String:");
			StringBuilder str1= revstr.reverse();
			System.out.print(str1);
		}
		else
		{
			System.out.println("No of Vowels =" +count);
			System.out.println("Reverse of the String:");
			StringBuilder str1= revstr.reverse();
			System.out.print(str1);
		}
	}
}