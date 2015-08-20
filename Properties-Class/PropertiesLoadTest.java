//version 11.1

// PropertyLoadTest.java

import java.util.*;
import java.io.*;

class PropertyLoadTest
{
	public static void main(String s[])
	{
		try
		{
			Properties p=new Properties();
			FileInputStream fin=new FileInputStream("abc.properties");
			
		p.load(fin);
			System.out.println("Properties are loaded");
		
		Set st=p.keySet();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			String value=(String)p.getProperty(key);
			System.out.println(key+" : "+value);		
		}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}	
	}
}		
