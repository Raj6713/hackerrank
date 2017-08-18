import java.io.*;
public class SubString 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1,s2,lp;
		s1=br.readLine();
        lp=br.readLine();
		s2=s1.substring(Integer.parseInt(lp.split(" ")[0]),Integer.parseInt(lp.split(" ")[1]));
		System.out.printf("%s\n",s2);
	}
}