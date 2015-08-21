//version 11.1

//This is the chat client program, run on client PCs. Client has two threads - main thread sends messages to be broadcasted to the server, and reader thread that accepts messages sent out by the broadcast server

// ChatClient.java

import java.net.*;
import java.io.*;

class ChatClient
{
	public static void main(String s[])
	{
		try
		{
			System.out.println("client started");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter user name");
			String name=br.readLine();
			System.out.println("welcome "+name);
			Socket sk=new Socket("localhost",1500);
			System.out.println("connection established");
			new ReaderThread(sk);	
	
			while(true)
			{
				System.out.println("enter msg and enter stop to terminate");
				String str=br.readLine();
				DataOutputStream dout=new DataOutputStream(sk.getOutputStream());
				if(str.equals("stop"))
				{
					dout.writeUTF(str);
					break;	
				}
				else
				{
					dout.writeUTF(name+": "+str);
					dout.flush();
				}
			}		
		}
		catch(Exception e)
		{	e.printStackTrace();	
		}
	}
}
class ReaderThread extends Thread
{
	Socket sk;
	ReaderThread(Socket sk)
	{
		this.sk=sk;
		setDaemon(true);
		start();
	} 
	public void run()
	{
		try
		{
			DataInputStream din=new DataInputStream(sk.getInputStream());
			while(true)
			{
				String str=din.readUTF();
				System.out.println(str);	
			}		
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
