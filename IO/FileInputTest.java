//Version 11.1

import java.io.*;

class FileInputTest
{
	public static void main(String s[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("abc.txt")
			int size=fin.available();
			byte b[]=new byte[size];
			fin.read(b); // copy the bytes from stream into the byte[].
			String str=new String(b);
			System.out.println(str);				fin.close();
		}	
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
