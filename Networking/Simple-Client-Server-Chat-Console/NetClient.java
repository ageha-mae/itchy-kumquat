//version 11.1

//Simple chat client, main thread accepts messages sent by server (readUTF()) and sends messages to server (writeUTF())

import java.net.*;
import java.io.*;

class NetClient
{
	public static void main(String s[])
	{
		try
		{
			System.out.println("client started");
			Socket skt=new Socket("localhost",1500);
		
			System.out.println("connection established");
			DataInputStream din=new DataInputStream(skt.getInputStream());
			DataOutputStream dout=new DataOutputStream(skt.getOutputStream());
	
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
			System.out.println("enter msg,enter stop to terminate");
			String str=br.readLine();
				
			dout.writeUTF(str);
			dout.flush();
		
			if(str.equals("stop"))
				break;
			
			str=din.readUTF();
			System.out.println("server msg:    "+str);
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
