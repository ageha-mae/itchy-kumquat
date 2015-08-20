//version 11.1

import java.util.*;
class Student 
{
	int rollno , marks;
	Student(int r,int m)
	{
		rollno=r;
		marks=m;
	}
	public String toString()
	{
		return(rollno+" : "+marks);
	}
	public int hashCode()
	{
		return(rollno);	
	}
	public boolean equals(Object ob)
	{
		Student st=(Student)ob;
		return(rollno == st.rollno);
	}
}
class TreeMapTest
{
	public static void main(String s[])
	{	
		TreeMap m=new TreeMap();
		m.put("101","abc");
		m.put("103","xyz");
		m.put("105","pqr");
		m.put("102","hij");
	
		Set st=m.entrySet();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			String key=(String)entry.getKey();
			String value=(String)entry.getValue();			System.out.println(key+" : "+value);
		}
	}
}
