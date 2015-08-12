//Version 11.1
//Swing frame, query result is navigable



import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ResultSetScrollTest  implements ActionListener
{

	JFrame fr;
	JTextField tf1,tf2,tf3,tf4;
	JLabel lb1,lb2,lb3,lb4;
	JButton b1,b2,b3,b4;
	ResultSet rs;
	ResultSetScrollTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());
	
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		tf4=new JTextField(10);
		lb1=new JLabel("Name");		
		lb2=new JLabel("Rollno");
		lb3=new JLabel("Marks");
		lb4=new JLabel("Grade");
		b1=new JButton("First");
		b2=new JButton("Prev");
		b3=new JButton("Next");
		b4=new JButton("Last");
		
	fr.add(lb1);fr.add(tf1);fr.add(lb2);fr.add(tf2);
	fr.add(lb3);fr.add(tf3);fr.add(lb4);fr.add(tf4);
	fr.add(b1);fr.add(b2);fr.add(b3);fr.add(b4);

	fr.setSize(400,400);
	fr.setVisible(true);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
	Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
	rs=st.executeQuery("select * from student");
	}
	catch(Exception e)
	{	e.printStackTrace();
	}
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==b1)
				rs.first();
			if(e.getSource()==b2)
				rs.previous();
			if(e.getSource()==b3)
				rs.next();
			if(e.getSource()==b4)
				rs.last();
			tf1.setText(rs.getString(1));
			tf2.setText(rs.getString(2));
			tf3.setText(rs.getString(3));
			tf4.setText(rs.getString(4));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	public static void main(String s[])
	{
		new ResultSetScrollTest();
	}
}

