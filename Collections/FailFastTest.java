//version 11.1


import java.util.*;

class FailFastTest
{
	public static void main(String s[])
	{
		Vector v=new Vector();
		v.add("abc");
		v.add("xyz");
		v.add("mno");
		v.add("pqr");
		v.add("hij");
		new MyThread(v);	
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
		}
		v.remove("mno");
	}
}
class MyThread extends Thread
{
	Vector v;
	MyThread(Vector v)
	{
		this.v=v;
		start();
	}
	public void run()
	{
		try
		{
			Enumeration et=v.elements();
			while(et.hasMoreElements())
			{
				System.out.println(et.nextElement());
				sleep(200);
			}			
		}
		catch(Exception e)
		{	e.printStackTrace();	
		}
	}
}

