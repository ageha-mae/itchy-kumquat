// version 1.3



class ArrayTest
{
	int a[];
	void input(int size)
	{
		a=new int[size];
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=(int)(Math.random()*30);
		}	
		System.out.println("array craeted and initialized");
	}
	void output()
	{
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}	
	}
	void sort()
	{
		for(int i=0 ; i<a.length-1 ;i++)
		{
			for(int j=i+1 ; j<a.length ; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	int search(int val)
	{
		for(int i=0; i<a.length ;i++)
		{
			if(a[i]==val)
				return(i);		
		}
		return(-1);
	}
	void delete(int val)
	{
		/*1.search the element
		2.create a new array object with size -1
		3.copy all the elements into new array except the element to be deleted
		4.copy the reference of new array object into a[]*/		
	}
	boolean insert(int val , int loc)
	{
		if(loc<0 || loc>=a.length)
			return(false);
		int temp[]=new int[a.length+1];
		for(int i=0 ; i<loc-1 ; i++)
		{
			temp[i]=a[i];	
		}
		temp[loc-1]=val;
		for(int i=loc-1 ; i<a.length ; i++)
		{
			temp[i+1]=a[i];	
		}
		a=temp;
		return(true);
	}
	int[] merge(int b[])
	{
		int c[]=new int[a.length + b.length];
		System.out.println("functionality is not ready");
		return(null);	
	}				
	int[] union(int b[])
	{
		System.out.println("method is not ready");		
		return(null);		
	}
	int[] intersect(int c[])
	{
		System.out.println("method is not ready");		
		return(null);				
	}
}
class ArrayOperationTest
{
	public static void main(String s[])
	{
		int x=Integer.parseInt(s[0]);
		ArrayTest al=new ArrayTest();
		al.input(x);
		System.out.println("List of values:  ");
		al.output();		
		
		al.sort();
		System.out.println("sorted list of values:   ");
		al.output();
		
		if(al.search(25)==-1)
			System.out.println("25 not found in the array");
		else
			System.out.println("25 is exist");
		
		System.out.println("\n Inserting 35 at 3 location");
		al.insert(35,3);
		System.out.println("list of values after the insertion:  ");
		al.output();
	}
}
