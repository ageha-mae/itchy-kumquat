//Version 11.1
//Makes a swing frame, db data appears in table format
//Only select query implemented here


import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

class DBTableTest implements ActionListener
{
	JFrame fr;
	JLabel lb;
	JComboBox cb;
	JTable table;
	DefaultComboBoxModel cbmodel;
	Connection con;
	JScrollPane pane;
	DBTableTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());

		lb=new JLabel("Select table");
		cb=new JComboBox();
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");

		DatabaseMetaData dbmd=con.getMetaData();
		ResultSet rs=dbmd.getTables(null,null,null,new String[]{"TABLE"});
		cbmodel=new DefaultComboBoxModel();
		while(rs.next())
		{
		cbmodel.addElement(rs.getString(3));
		}
		}
		catch(Exception ee)
		{	ee.printStackTrace();
		}
		cb.setModel(cbmodel);

		table=new JTable();
		pane=new JScrollPane(table);		
		pane.setPreferredSize(new Dimension(250,250));

		fr.add(lb);
		fr.add(cb);
		fr.add(pane);

		fr.setSize(300,300);
		fr.setVisible(true);
		cb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cb)
		{
			String tab=(String)cb.getSelectedItem();
			try
			{
			PreparedStatement ps=con.prepareStatement("select * from "+tab);
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int colCount=rsmd.getColumnCount();
			DefaultTableModel model=new DefaultTableModel();
			for(int i=1 ; i<=colCount ;i++)
			{
		model.addColumn(rsmd.getColumnName(i));	
			}
			while(rs.next())
			{
				String data[]=new String[colCount];
				for(int i=1;i<=colCount;i++)
				{
					data[i-1]=rs.getString(i);				
				}								model.addRow(data);	
			}
			table.setModel(model);
			}
			catch(Exception ee)
			{	ee.printStackTrace();
			}
		}
	}	
	public static void main(String s[])
	{
		new DBTableTest();			
	}
}
