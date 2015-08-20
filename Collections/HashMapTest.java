//Version 11.1

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
class HashMapTest
{
	public static void main(String s[])
	{	
		HashMap hm=new HashMap();
		hm.put(new Student(101,80),"abc");
		hm.put(new Student(102,75),"xyz");
		hm.put(new Student(103,85),"pqr");
		hm.put(new Student(101,55),"hij");
	
		Set st=hm.keySet();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Student key=(Student)itr.next();
			String value=(String)hm.get(key);
			System.out.println(key+" : "+value);
		}
	}
}
