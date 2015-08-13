//Version 11.1


import java.io.*;

class Student implements Serializable
{
	int rollno,marks;
	transient String name;
	Student(String name,int rollno,int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString()
	{
		return(name+"  "+rollno+"  "+marks);
	}
}
class SerializationTest
{
	public static void main(String s[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("student.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("enter the name, rollno and marks");
			String name=br.readLine();
			int rollno=Integer.parseInt(br.readLine());
			int marks=Integer.parseInt(br.readLine());
			Student st=new Student(name,rollno,marks);
			out.writeObject(st);	
			out.flush();
				
			System.out.println("do you want to insert more record(y/n)");
			String option=br.readLine();
			if(option.equals("n"))
				break;
			}
			fout.close();
		}
		catch(Exception e)
		{	e.printStackTrace();
		}			
	}
}
					
