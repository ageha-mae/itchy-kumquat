Version 11.1

import java.io.*;

class DeserializationTest
{
	public static void main(String s[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("student.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			while(true)
			{
				try
				{
					Student st=(Student)in.readObject();
				System.out.println(st);
				}	
				catch(EOFException e)
				{								break;
				}
			}
			in.close();
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
