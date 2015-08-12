//Version 11.1
//Insert and delete

import java.sql.*;
import java.io.*;

class DBOperationTest
{
	public static void main(String s[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver class loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ducatPrac","abcd");

		System.out.println("connection object prepared");

		/*Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("storing the record:");
		System.out.println("Anand 709 99 A");
		int x=st.executeUpdate("insert into student values('Anand','709',99,'A') ");


		if(x==1)
	System.out.println("record inserted  successfully");

	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
	int count=1;
	while(count<=5)
	{
	System.out.println("enter the name,rollno,marks and grade");

	String name=br.readLine();
	String rollno=br.readLine();
	int marks=Integer.parseInt(br.readLine());
	String grade =br.readLine();
	ps.setString(1,name);
	ps.setString(2,rollno);
	ps.setInt(3,marks);
	ps.setString(4,grade);
	x=ps.executeUpdate();
	count++;
	}
	if(x==1)
		System.out.println("record inserted");*/

	String rollno="709";
	PreparedStatement ps=con.prepareStatement("delete from student where rollno=?");
	ps.setString(1,rollno);
	ps.executeUpdate();
	System.out.println("Record deleted");

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









