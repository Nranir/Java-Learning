package lesson31;

import java.util.LinkedList;

public class MyCLass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//linked list podobne do arraylist, 
		LinkedList<String> name = new LinkedList<String>();
		name.add("Patrik");
		name.add("Tom");
		name.add("Mark");
		name.add("Xenax");
		name.addFirst("Jacek");
		name.addLast("Michal");
		
		name.removeLast();
		name.removeFirst();
		
		//name.clear(); usuwa wszystko
		
		System.out.println("size: "+ name.size());
		
		name.add(2, "index2");
		name.remove(2);
		
		name.set(0, "patric");
		

		
		for(String x : name)
		{
			System.out.println(x);
		}
		
	}

}
