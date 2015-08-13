//Version 11.1


import java.io.*;

class DataInputTest
{
	public static void main(String s[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("student.txt");
			DataInputStream din=new DataInputStream(fin);
			while(true)
			{
				try
				{	
				String name=din.readUTF();
				int rno=din.readInt();
				float marks=din.readFloat();
				char grade=din.readChar();		
				System.out.println(name+"   "+rno+"  "+marks+"   "+grade);
				}
				catch(EOFException e)
				{	break;
				}
			}
		}
		catch(Exception e)
		{	e.printStackTrace();	
		}
	}
}
