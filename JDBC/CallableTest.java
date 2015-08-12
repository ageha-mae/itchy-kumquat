//Version 11.1

import java.sql.*;

class CallableTest
{
	public static void main(String s[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducatPrac","abcd");
		System.out.println("connection object obtained");
		CallableStatement cs=con.prepareCall("{?=call factorial(?)}");
		cs.registerOutParameter(1,Types.INTEGER);
		
		cs.setInt(2,5);
		cs.execute();
	
		int fact=cs.getInt(1);
		System.out.println("Factorial = "+fact);
		}
		catch(Exception e)
		{	e.printStackTrace();	
		}
	}
}

