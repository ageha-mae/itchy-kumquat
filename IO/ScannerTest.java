//Version 11.1

  


import java.util.*;

class ScannerTest
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name, rollno,marks and grade of the student");

		String name=sc.next();
		int rollno=sc.nextInt();
		float marks=sc.nextFloat();
		char grade=sc.next().charAt(0);

		System.out.println("Name:  "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);
	}
}
