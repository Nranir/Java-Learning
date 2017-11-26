package lesson34;
import java.util.*;
public class MyClass
{
	/*
	 * Hashset cannot contain duplicate elements
	 * 
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet<String> name = new HashSet<String>();
		name.add("tomas");
		name.add("tom");
		name.add("tom");
		name.add("mark");
		name.add("july");
		name.add("patrik");
		
		
		
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
