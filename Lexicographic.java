/*Write a program which will find the smallest substring and largest lexicographically*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Lexicographic 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s1;
		int size;
		s1=input.readLine();
        size=Integer.parseInt(input.readLine());
        System.out.printf("%s\n",larASmall(s1,size));
	}

	public static String larASmall(String s1, int k)
	{
     String small=s1.substring(0,k);
     String large=s1.substring(0,k);
     int r;
     for(int i=0;i<s1.length()-k;i++)
     {
     	//Comparision module for the smallest lexicographically
     	r=s1.substring(i,k+i).compareTo(s1.substring(i+1,k+i+1));
         if(r<0)
     	    small=s1.substring(i,k+i);
     	
         r= s1.substring(i,k+i).compareTo(s1.substring(i+1,k+i+1));
     	  if(r>0) 
     	  large=s1.substring(i+1,k+i+1);
     }
     return small+"\n"+large;
	}
}