//version 11.1

//use of Comparable Interface

import java.util.*;
class Student implements Comparable
{
	int rollno,marks;
	String name;
	Student(String name ,int rollno , int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString()
	{
		return(name+"   "+rollno+"   "+marks);
	}
	public int compareTo(Object ob)
	{
		Student st1=(Student)ob;
		return(rollno - st1.rollno);
	}
}
class SortTest
{
	public static void main(String s[])
	{
		ArrayList al=new ArrayList();
		al.add(new Student("abc",103,86));
		al.add(new Student("xyz",101,45));
		al.add(new Student("abc",104,95));
		al.add(new Student("hij",102,75));

		Collections.sort(al);

		List l=Collections.synchronizedList(al);

		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());			}			
	}
}

