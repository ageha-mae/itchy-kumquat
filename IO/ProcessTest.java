//Version 11.1


import java.io.*;

class ProcessTest
{
	public static void main(String s[])
	{
		try
		{
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("javac "+s[0]);
		p.waitFor();

		BufferedReader br=new BufferedReader(new InputStreamReader(p.getErrorStream()));
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
