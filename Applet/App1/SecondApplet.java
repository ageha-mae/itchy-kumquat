//Version 11.1


import java.applet.*;
import java.awt.*;

public class SecondApplet extends Applet
{
	int type;
	public void init()
	{
		setBackground(Color.GRAY);
	}
	public void paint(Graphics g)
	{
		g.drawString("select the shape from frist applet", 30,50);
		if(type==1)
			g.drawRect(50,100,100,150);
		if(type==2)
			g.drawOval(50,100,150,150);
	}
}
