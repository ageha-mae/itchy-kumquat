//version 11.1

// PropertiesStoreTest.java

import java.util.*;
import java.io.*;

class PropertiesStoreTest
{
	public static void main(String s[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("abc.properties");
			Properties p=new Properties();
			p.setProperty("AA","Developer");
			p.setProperty("BB","Tester");
			p.setProperty("CC","Developer");

			p.store(fout,"details of employees");
			System.out.println("properties are stored successfully");
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
