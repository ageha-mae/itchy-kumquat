//Version 11.1

import java.io.*;

class PipedIOTest
{
	public static void main(String s[])
	{
		try
		{
			PipedOutputStream pout=new PipedOutputStream();
			PipedInputStream pin=new PipedInputStream(pout);
			ReaderThread rth=new ReaderThread(s[0] , pout);
			WriterThread wth=new WriterThread(s[1] , pin);
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}		
}
class ReaderThread extends Thread
{
	PipedOutputStream pout;
	String fname;
	ReaderThread(String fname,PipedOutputStream pout)
	{
		this.fname=fname;
		this.pout=pout;
		start();
	}
	public void run()
	{
		try
		{
			PrintWriter out=new PrintWriter(pout);
			FileInputStream fin=new FileInputStream(fname);
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			while(true)
			{
				String str=br.readLine();
				if(str==null)
					break;
				out.println(str);
				out.flush();					}
			System.out.println("content copied into the piped output stream");
		}
		catch(Exception e)	
		{	e.printStackTrace();		
		}
	}
}
class WriterThread extends Thread
{
	String fname;
	PipedInputStream pin;
	WriterThread(String fname,PipedInputStream pin)
	{
		this.fname=fname;
		this.pin=pin;
		start();
	}
	public void run()
	{
		try
		{
			FileOutputStream fout=new FileOutputStream(fname);
			PrintWriter out=new PrintWriter(fout);
			BufferedReader br=new BufferedReader(new InputStreamReader(pin));
			while(true)
			{
				try
				{
				String str=br.readLine();
				out.println(str);
				out.flush();
				}
				catch(Exception e)
				{	break;
				}
			}
			System.out.println("bytes are copied into the file from piped input stream");
		}
		catch(Exception e)
		{	e.printStackTrace();
		}	
	}
}
