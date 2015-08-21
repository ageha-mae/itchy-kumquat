//version 11.1

//It is the sender of the datagram packet

import java.net.*;
import java.io.*;

class UDPSender
{
	public static void main(String s[])
	{
		try
		{
			System.out.println("sender started");
			DatagramSocket sender=new DatagramSocket(4000);
				
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			while(true)	
			{
				System.out.println("enter msg , press blank enter to terminate");
			String str=br.readLine();
			
			byte b[]=str.getBytes();
			DatagramPacket packet=new DatagramPacket(b , b.length , InetAddress.getLocalHost() , 3000);
			sender.send(packet);
			if(str.length()==0)
				break;
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
	
						
		
							
