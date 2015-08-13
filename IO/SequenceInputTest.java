//Version 11.1


import java.io.*;

class SequenceInputTest
{
	public static void main(String s[])
	{
		try
		{
			FileInputStream fin1=new FileInputStream("fin1.txt");
			FileInputStream fin2=new FileInputStream("fin2.txt");
	
			SequenceInputStream seq=new SequenceInputStream(fin1,fin2);
			BufferedReader br=new BufferedReader(new InputStreamReader(seq));
			while(true)
			{
				String str=br.readLine();
				if(str==null)
					break;
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
		}
	}
}
