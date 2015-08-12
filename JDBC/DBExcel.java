//Version 11.1


import java.sql.*;
import java.util.*;

class DBTest
{
	public static void main(String s[])
	{
		try
		{
	/*Class.forName("oracle.jdbc.driver.OracleDriver");
	System.setProperty("jdbc.drivers","oracle.jdbc.driver.Oracle.Driver:sun.jdbc.odbc.JdbcOdbcDriver:com.mysql.jdbc.Driver");*/
	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

Connection con=DriverManager.getConnection("jdbc:odbc:myexcelDSN");
	Statement st=con.createStatement();
	System.out.println("Retrieving the recods: ");
	ResultSet rs=st.executeQuery("select * from [Sheet1$]");
		while(rs.next())
		{
		System.out.print(rs.getString(1));
		System.out.print("\t"+rs.getString(2));
		System.out.print("\t"+rs.getString(3));
		System.out.println("\t"+rs.getString(4));
		}
		con.close();
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
