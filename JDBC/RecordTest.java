//Version 11.1

//RecordTest.java

import java.sql.*;
import sun.jdbc.odbc.*;
import java.util.*;
import java.io.*;

class RecordTest
{
	public static void main(String s[])
	{
		try
		{
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducatPrac","abcd");
	
		/*Driver d=new oracle.jdbc.driver.OracleDriver();
		Properties p=new Properties();
		p.put("user","ducatPrac");
		p.put("password","abcd");
		Connection con=d.connect("jdbc:oracle:thin:@localhost:1521:XE",p);*/

		/*System.setProperty("jdbc.drivers","sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
		System.out.println("connection object prepared");*/

		/*Properties p=new Properties();
		FileInputStream fin=new FileInputStream("DBInfo.properties");
		p.load(fin);
		String DBDriver=(String)p.getProperty("driver");
		String DBUrl=(String)p.getProperty("url");
		String DBUser=(String)p.getProperty("user");
		String DBPass=(String)p.getProperty("password");

		Class.forName(DBDriver);
		Connection con=DriverManager.getConnection(DBUrl,DBUser,DBPass);*/

		System.out.println("connection object prepared");

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}		
		
		con.close();
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}

		


		




		
