package lesson37;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class MyClass
{

	public static void main(String[] args)
	{
		File file = new File("fileName.txt");
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
		PrintWriter pw = new PrintWriter(file);
		
		pw.println("this is my file content");
		pw.println("10000");
		pw.close();
		System.out.println("Done");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
