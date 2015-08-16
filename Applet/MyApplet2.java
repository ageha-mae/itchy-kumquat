//Version 11.1
//Changes rectangle size on button click


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyApplet2 extends Applet implements ActionListener
{
	int x,y,w,h;
	boolean b1,b2;
	Button bt1,bt2;	

	public void init()
	{
		bt1=new Button("Start");
		bt2=new Button("Stop");
		bt1.addActionListener(this);	
		bt2.addActionListener(this);
		add(bt1);
		add(bt2);
		x=50;
		y=80;
		w=250;
		h=250;
	}	
	public void paint(Graphics g)
	{
		g.drawRect(x,y,w,h);
	}	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bt1)
		{
			b1=true;
			new DrawThread(this);
		}
		if(e.getSource()==bt2)
		{
			b1=false;
		}
	}
}
class DrawThread extends Thread
{
	MyApplet2 app;
	DrawThread(MyApplet2 app)
	{
		this.app=app;
		start();		
	}
	public void run()
	{
		while(app.b1)
		{
			if(app.x<250 && !app.b2)
			{	app.x+=20;
				app.y+=20;
				app.w-=20;
				app.h-=20;
			}		
			if(app.x>50 && app.b2)
			{
				app.x-=20;
				app.y-=20;
				app.w+=20;
				app.h+=20;
			}
			if(app.x==250)
				app.b2=true;
			if(app.x==50)
				app.b2=false;
	
			app.repaint();		
			try	
			{
				sleep(300);		
			}
			catch(Exception e)
			{	e.printStackTrace();
			}	
		}
	}
}
