//version 11.1

import java.util.*;

class ArrayListTest
{
	public static void main(String s[])
	{
		ArrayList <Animal>al=new ArrayList<Animal>();
	
		al.add(new String("ABC"));
		al.add("xyz");
		al.add(new Integer(55));
		al.add("pqr");
		al.add("xyz");
		al.add("hij");
		
		System.out.println("No. of elements:   "+al.size());
		System.out.println("List of elements:   ");
		/*for(int i=0 ; i<al.size() ; i++)
		{
			System.out.println(al.get(i));
		}*/
		/*for(Object ob:al)
		{
			String str=(String)ob;
			System.out.println(str+" : "+str.toUpperCase());	
		}*/
	
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(ob);
		}
		
		
		System.out.println("Contains pqr:  "+al.contains("pqr"));
		System.out.println("Contains ABC: "+al.contains("ABC"));
	
		System.out.println("Remove mno:  "+al.remove("mno"));	
		System.out.println("index of xyz:  "+al.indexOf("xyz"));
	
		System.out.println("last index of xyz:  "+al.lastIndexOf("xyz"));
	}
}

