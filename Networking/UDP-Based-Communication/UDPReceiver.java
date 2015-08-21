//version 11.1

//It is the receiver of the sent datagram packet

import java.net.*;

class UDPReceiver
{
	public static void main(String s[])
	{
		try
		{
			System.out.println("receiver started");
			DatagramSocket receiver=new DatagramSocket(3000);
	
			while(true)
			{
				byte b[]=new byte[100];
				DatagramPacket packet=new DatagramPacket(b , b.length);
				receiver.receive(packet);
				String str=new String(b);
							if(str.trim().length()==0)
					break;
	
				System.out.println("Msg recd:   "+str);
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
