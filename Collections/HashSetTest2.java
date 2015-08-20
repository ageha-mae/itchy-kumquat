//version 11.1

import java.util.*;

class Student
{
	int rollno,marks;
	char grade;
	String name;
	Student(int rollno,int marks,String name)
	{
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
	}
	public String toString()
	{
		return(rollno+"   "+name+"   "+marks);
	}
	public int hashCode()
	{
		return(rollno);
	}
	public boolean equals(Object ob)
	{
		Student st=(Student)ob;
		return(rollno == st.rollno && marks == st.marks);	
	}	
}
class HashSetTest2
{
	public static void main(String s[])
	{
		HashSet hs=new HashSet();
		hs.add(new Student(101,85,"abc"));
		hs.add(new Student(102,75,"xyz"));
		hs.add(new Student(103,65,"pqr"));
		hs.add(new Student(101,85,"hij"));
	
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}
}

