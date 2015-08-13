//Version 11.1

 import java.io.*;

class FileOutputTest
{
	public static void main(String s[])
	{
		try	
		{
			FileOutputStream fout=new FileOutputStream("abc.txt");
			String str[]={"this is the first line","\nthis is the second line","\nthis is the third line"};
			
		for(int i=0 ; i<str.length ;i++)
			{
				byte b[]=str[i].getBytes();
				fout.write(b);
				fout.flush();
			}
			fout.close();
			System.out.println("contents copied into the file");
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
