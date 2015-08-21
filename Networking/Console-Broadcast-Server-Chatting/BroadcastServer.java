//version 11.1

//This is the broadcast server

import java.util.*;
import java.io.*;
import java.net.*;

class BroadcastServer
{
	public static void main(String s[])	
	{
		try
		{
			System.out.println("server started");
			ServerSocket ss=new ServerSocket(1500);
			ArrayList al=new ArrayList();
			// Collection prepared, contains all connected clients
			
			while(true)
			{
				Socket sk=ss.accept();
				System.out.println("client connected");
				al.add(sk);
				new ClientThread(al,sk);	
			}
		}
		catch(Exception e)
		{	e.printStackTrace();			
		}
	}
}
class ClientThread extends Thread
{
	Socket sk;
	ArrayList al;
	ClientThread(ArrayList al,Socket sk)
	{
		this.al=al;	
		this.sk=sk;
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
				if(str.equals("stop"))
				{
					al.remove(sk);
					break;
				}
				else
				{
				broadcast(str);
				}
			}	
		}
		catch(Exception e)
		{	e.printStackTrace();
		}	
	}
	void broadcast(String msg)
	{
		try
		{
			for(Object ob:al)
			{
				Socket sk=(Socket)ob;
				DataOutputStream dout=new DataOutputStream(sk.getOutputStream());					
				dout.writeUTF(msg);					
				dout.flush();	
			}	
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}

