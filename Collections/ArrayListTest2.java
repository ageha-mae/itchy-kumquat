//version 11.1

import java.util.*;

class Student 
{
	int rollno,marks;
	String name;
	Student(int rollno , int marks , String name)
	{
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
	}
	void show()
	{
		System.out.println(rollno+" : "+name+" : "+marks);
	}
	public String toString()
	{
		return(rollno+"  "+name+"  "+marks);
	}
	public boolean equals(Object ob)
	{
		Student st=(Student)ob;
		return(rollno==st.rollno && marks==st.marks && name.equals(st.name));
	}
}
class ArrayListTest2
{
	public static void main(String s[])
	{
		ArrayList <Student>al=new ArrayList<Student>();
		al.add(new Student(101,85,"abc"));
		al.add(new Student(102,75,"xyz"));
		al.add(new Student(103,55,"mno"));
		al.add(new Student(104,90,"pqr"));	
			
		Iterator <Student>itr=al.iterator();
		while(itr.hasNext())
		{
			//Student st=itr.next();
			System.out.println(itr.next());
		}	
		System.out.println("contains 101 85 abc:   "+al.contains(new Student(101,85,"abc")));
		System.out.println("remove 103 55 mno:  "+al.remove(new Student(103,55,"mno")));

	}
}
