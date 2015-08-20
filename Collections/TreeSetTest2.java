//version 11.1

//uses Comparator

import java.util.*;

class MarksSort implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		Student st1=(Student)ob1;
		Student st2=(Student)ob2;
		return(st1.marks - st2.marks);
	}
}
class RollnoSort implements Comparator
{
	public int compare(Object ob1 , Object ob2)
	{
		Student st1=(Student)ob1;
		Student st2=(Student)ob2;
		return(st1.rollno - st2.rollno);
	}
}
class Student
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
}
class TreeSetTest2
{
	public static void main(String s[])
	{
		TreeSet ts=new TreeSet();
		ts.add(new Student("abc",103,86));
		ts.add(new Student("xyz",101,45));
		ts.add(new Student("abc",104,95));
		ts.add(new Student("hij",102,75));

		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}
}
