package lesson30;
import java.util.ArrayList;
public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int simple_array[]= new int[5] ;// or {1,2,3,4,5};
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(2);
		myList.add(5);
		myList.add(55);
		myList.add(74);
		
		
		myList.remove(2); //usuwanie po indexach
		myList.set(0, 100); //ustawianie wartosci na konkretnym indexie
		myList.trimToSize();
		
		for(Integer x: myList)
		{
			System.out.println(x);
		}
		
		System.out.println("Size of list " + myList.size());
		
		
		
	}

}
