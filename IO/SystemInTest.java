//Version 11.1

import java.io.*;

class SystemInTest
{
	public static void main(String s[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			System.out.println("enter name");
			String str=br.readLine();
			System.out.println(str);
			
		}	
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}



