//Version 11.1

		

import java.util.*;
class StringTokenTest
{
	public static void main(String s[])
	{
		StringTokenizer tk=new StringTokenizer("this_is_the_tokened_string","_",true);

		while(tk.hasMoreTokens())
		{
			System.out.println(tk.nextToken());
		}	
	}
}
