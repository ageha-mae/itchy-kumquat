//version 11.1

//Extremely basic chat server - simply receives and pushes messages, does not keep track of which client is online/offline, no chatting between clients


import java.net.*;
import java.io.*;

class MyServer
{
	public static void main(String s[])
	{
		try
		{
			System.out.println("server started");
			ServerSocket sk=new ServerSocket(1500);
			System.out.println("waiting for the client request......");
	
			Socket st=sk.accept();
			System.out.println("client connected");
			DataInputStream din=new DataInputStream(st.getInputStream());
			DataOutputStream dout=new DataOutputStream(st.getOutputStream());

			while(true)
			{
				String str=din.readUTF();
			System.out.println("Client msg: "+str);
			if(str.equals("stop"))
				break;
				
				str=str.toUpperCase();
				dout.writeUTF(str);
				dout.flush();
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
		
