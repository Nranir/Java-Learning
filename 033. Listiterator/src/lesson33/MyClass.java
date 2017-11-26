package lesson33;
import java.util.*;
public class MyClass
{
	
	/*
	 * public boolean hasNext();
	 * public Object next();
	 * public boolean hasPrevious();
	 * public Object previous();
	 */
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Tom");
		names.add("mark");
		names.add("john");
		names.add("jack");
		names.add("patrik");
		
		ListIterator<String> itr = names.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(" ");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
