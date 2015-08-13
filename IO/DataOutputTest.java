//Version 11.1



import java.io.*;

class DataIOTest
{
	public static void main(String s[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("student.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				System.out.println("enter the name,rollno,marks and grade");	
	
				String name=br.readLine();
				int rollno=Integer.parseInt(br.readLine());
				float marks=Float.parseFloat(br.readLine());
				char grade=br.readLine().charAt(0);
				dout.writeUTF(name);
				dout.writeInt(rollno);
				dout.writeFloat(marks);
				dout.writeChar(grade);
				dout.flush();	
				
				System.out.println("do you want to enter more record(y/n)");	
				String option=br.readLine();
				if(option.equalsIgnoreCase("n"))
				{
					break;
				}						}
		}
		catch(Exception e)
		{	e.printStackTrace();	
		}
	}
}
