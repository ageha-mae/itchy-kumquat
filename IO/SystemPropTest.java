//Version 11.1

import java.io.*;
class SystemPropTest
{
	public static void main(String s[])
	{
		try
		{
			PrintStream p1=new PrintStream("abc.txt");
			PrintStream p2=new PrintStream("err.txt");
			
			FileInputStream fin=new FileInputStream("xyz.txt");
			System.out.println("changing the default stream of System class");
			System.setIn(fin);
			System.setOut(p1);
			System.setErr(p2);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				String str=br.readLine();
				if(str==null)
					break;
				if(str.length()>=10)
			System.out.println(str);	
				else
			System.err.println(str);	
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}	
	}
}
