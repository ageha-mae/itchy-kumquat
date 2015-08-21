//Version 11.1



import java.io.*;

class FileTest
{
	public static void main(String s[])throws IOException
	{
		File f1=new File("first.txt");
		File f2=new File("second.txt");
		f2.createNewFile();

		System.out.println("is first.txt exist:    "+f1.exists());

		System.out.println("creating first.txt:   "+f1.createNewFile());
		
		File dir=new File("temp");
		System.out.println("creating the directory:    "+dir.mkdir());
		
		System.out.println("removing temp dir:   "+dir.delete());
				
		File f3=new File("third.txt");
		System.out.println("renaming the second.txt:    "+f2.renameTo(f3));		
	}
}

//

