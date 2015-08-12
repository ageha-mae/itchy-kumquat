//Version 11.1
//Transaction and rollback using savepoint



import java.sql.*;

class TransactionTest2
{
	public static void main(String s[])
	{
		Connection con=null;
		Savepoint point=null;
		try
		{
	Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducatPrac","abcd");

		con.setAutoCommit(false);
		Statement st=con.createStatement();
			
		st.executeUpdate("insert into student values('QWERT','999',55,'c')");
		
		point=con.setSavepoint("abc");

		st.executeUpdate("insert into student values('UVWX','666',33,'D')");

		//st.executeUpdate("delete from where rollno='101'"); // wrong syntax, generates SQLException		
		st.executeUpdate("insert into student values('MNOP','666',100,'A')");
		
		con.commit();
		System.out.println("Transaction commited successfully");
		}
		catch(Exception e)
		{	try
			{
			System.out.println("Transaction not completed successfully, rollbacked upto savepoint");
				con.rollback(point);
				con.commit();
			}
			catch(Exception ee)
			{	
			ee.printStackTrace();
			}
		}
	}
}
