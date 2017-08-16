/*This file will read data from a file and print it*/
import java.util.Scanner;
import java.io.*;
public class File1 
{
	public static void main(String[] args) throws IOException
	{
		Scanner input=new Scanner(new FileReader("g:/Java Practice/Hypotonuse.java"));
		String message;
		int i=1;
		while(input.hasNext())
		{
			message=input.nextLine();
			System.out.printf("%d %s\n",i,message);
			i++;
		}
	}
}