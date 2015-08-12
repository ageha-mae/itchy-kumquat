//Version 11.1
//Grouping of operations into transaction


import java.sql.*;

class TransactionTest
{
	public static void main(String s[])
	{
		Connection con=null;
		try
		{
	Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducatPrac","abcd");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		st.executeUpdate("insert into student values('QWERT','999',55,'c')");
							st.executeUpdate("insert into student values('PQRST','888',44,'D')");

		//st.executeUpdate("delete from student where rollno='101'"); // wrong syntax, generates SQLException		
		st.executeUpdate("insert into student values('MNOP','666',100,'A')");
		
		con.commit();
		System.out.println("Transaction commited successfully");
		}
		catch(Exception e)
		{	try
			{
			System.out.println("Transaction not completed successfully");
			con.rollback();
			}
			catch(Exception ee)
			{
			}
		}
	}
}
