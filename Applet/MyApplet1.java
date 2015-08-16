//version 11.1
//Click button to change colour of shape


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MyApplet1 extends Applet implements ActionListener
{
	Button b1,b2;
	int type;
	public void update(Graphics g)
	{
		paint(g);
	}
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
		if(type==1)
		{
			g.setColor(Color.RED);
			g.fillRect(50,120,100,100);	
		}	
		if(type==2)
		{
			g.setColor(Color.GREEN);
			g.fillOval(50,120,100,100);
		}
	}
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource()==b1)
		{
			type=1;
		}
		if(e.getSource()==b2)
			type=2;
		repaint();
	}
}
