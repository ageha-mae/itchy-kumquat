//Version 11.1

import java.io.*;

class MyReader
{
	InputStream myReadData()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("enter text, enter only space to terminate");
			String str="";
			while(true)
			{
				String s=br.readLine();
				if(s.equals(" "))						break;						str=str+"\n"+s;
			}
			byte b[]=str.getBytes();
			ByteArrayInputStream bis=new ByteArrayInputStream(b);
			return(bis);
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
		return(null);
	}
}
class ByteArrayIOTest
{
	public static void main(String s[])
	{
		try
		{
			MyReader r=new MyReader();
			
			FileOutputStream fout=new FileOutputStream("test.txt");
			
			InputStream in=r.myReadData();
			byte b[]=new byte[in.available()];
			in.read(b);
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
	
			bout.write(b);
			System.out.println("data copied into the Byte array output stream");
	
			bout.writeTo(fout);
			System.out.println("data is copied into the file");
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
