/*Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.*/
import java.io.*;
import java.util.Scanner;
public class String1 
{
	public static void main(String[] args) throws IOException
	{
		Scanner input=new Scanner(System.in);
		String s1,s2;
		s1=input.next();
		s2=input.next();
		int len=s1.length()+s2.length();
		System.out.printf("%d\n",len);
		int p=s1.compareTo(s2);
		if(p<0)
			System.out.printf("Yes\n");
		else 
			System.out.printf("No\n");
     	s1=s1.substring(0,1).toUpperCase()+s1.substring(1);
		s2=s2.substring(0,1).toUpperCase()+s2.substring(1);
		System.out.printf("%s %s\n",s1,s2);
	}
}