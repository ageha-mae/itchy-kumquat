//Version 11.1

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="FirstApplet.class" height="400" width="400" name="first">
	</applet>

	<applet code="SecondApplet.class" height="400" width="400" name="second">
	</applet>
*/


public class FirstApplet extends Applet implements ActionListener
{
	Button b1,b2;
	public void init()
	{
		b1=new Button("Rect");
		b2=new Button("Circle");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		setBackground(Color.GRAY);
	}
	public void paint(Graphics g)
	{
		g.drawString("select the shape to be drawn on the second applet" , 50 , 120);	
	}
	public void actionPerformed(ActionEvent e)
	{
		AppletContext ctx=getAppletContext();
		SecondApplet target=(SecondApplet)ctx.getApplet("second");
		if(e.getSource()==b1)
		{
			target.type=1;					}
		if(e.getSource()==b2)
		{
			target.type=2;
		}
		target.repaint();
	}
}

