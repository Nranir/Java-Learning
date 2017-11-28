package lesson38;
//##########writing##########
import java.io.File;
import java.io.PrintWriter;
//###########READING##################
import java.io.BufferedReader;
import java.io.FileReader;
//######obsluga bledow
import java.io.IOException;

public class MyClass
{

	public static void main(String[] args)
	{
		//############WRITING#####################
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
		//System.out.println("Done");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
		//############READING#############
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("fileName.txt"));
			
			String line;
			while((line = br.readLine())!= null)
			{
				System.out.println(line);
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
