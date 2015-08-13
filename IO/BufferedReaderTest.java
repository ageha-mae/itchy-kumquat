//Version 11.1

import java.io.*;

class BufferedReaderTest
{
	public static void main(String s[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("abc.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));	
			while(true)
			{
				String str=br.readLine();
				if(str==null)
					break;
			System.out.println(str);
			}
		}	
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
