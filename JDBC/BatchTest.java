//Version 11.1
// addBatch() and executeBatch() methods of Statement class to execute operations as a batch

import java.sql.*;
class BatchTest
{
	public static void main(String s[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducatPrac","abcd");
		Statement st=con.createStatement();
		st.addBatch("insert into student values('Lalit',102,99,'A')");
		st.addBatch("insert into student values('Ajay',108,55,'C')");
		st.addBatch("delete from student where rollno=101");
		st.executeBatch();
		System.out.println("Batch executed successfully");
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
