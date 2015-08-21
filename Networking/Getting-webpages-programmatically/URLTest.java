//version 11.1

//Uses URl and URLConnection classes to connect to and load specified webpage into a file


package mypack;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class URLTest 
{
	public static void main(String[] args) 
	{
		 try
	        {
	            URL url = new URL("https://facebook.com");
	            URLConnection connection = url.openConnection();
  
	            InputStream inStream = connection.getInputStream();
	            BufferedReader input =
	     new BufferedReader(new InputStreamReader(inStream));
	            String line = "";
	            File f=new File("abc.html");
	            FileOutputStream fout=new FileOutputStream(f);
	            while ((line = input.readLine()) != null)
	            {
	            	System.out.println(line);
	            	fout.write(line.getBytes());
	            	fout.flush();
	            }
	            String realPath=f.getAbsolutePath();
	            Runtime.getRuntime().exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe "+realPath);
	        }
	        catch(Exception e)
	        {     e.printStackTrace();
	        }
	}
}
	








