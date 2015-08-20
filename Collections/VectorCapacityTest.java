//Version 11.1

import java.util.*;

class VectorCapacityTest
{
	public static void main(String s[])
	{
		Vector v=new Vector(5);
		
		System.out.println("Current capacity:  "+v.capacity());
		
		//v.ensureCapacity(15);	
		//v.ensureCapacity(4);
		v.ensureCapacity(8);

		System.out.println("New Capacity:  "+v.capacity());
	}
}
