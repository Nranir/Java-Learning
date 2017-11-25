package lesson32;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 1. LinkedList element Insertion is faster compared to ArrayList
 * 
 * 2. ArrayList search operation is pretty fast compared to LinkedList search operation.
 * LinkedList doesn.t provide Random or index bases access and you need to iterate over linedlist to retrive any element
 * 
 * 3/ Linkedlist element deletion is faster compared to arraylist
 * 
 * 4. LinkedList has more memory overhead than arraylist becouse in arraylist each index only holds actual object
 * but in case off linkedlist each node holds both data and address of next and previous node
 * 
 * 
 * 
 * 
 * #########UWAGA z interneta################
 * 
 * Szukanie - szybsze w arraylist O(1), w linked O(n)
 * Dodawania /usuwanie - w linked O(1), w array od O(1) do O(n)
 * Pamiec : wiecej zuzywa linked a mniej array
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		long n = (long) 1E7; //(10 ^ 7)
		
		ArrayList arrayList = new ArrayList();
		long milis = System.currentTimeMillis();
		
		for (int i = 0; i<n;i++)
		{
			arrayList.add(i);
			
		}
		
		System.out.println("insert arraylist takes "+ (System.currentTimeMillis()-milis));
		
		LinkedList linkedlist = new LinkedList();
		milis = System.currentTimeMillis();
		for(int i=0; i<n;i++)
		{
			linkedlist.add(i);
			
		}
		System.out.println("insertlinkedlist takes " + (System.currentTimeMillis()-milis));
		
		
		//remove from beggining
		milis = System.currentTimeMillis();
		arrayList.remove(0);
		System.out.println("Del front arrayList takes " +(System.currentTimeMillis()-milis));
		
		milis = System.currentTimeMillis();
		linkedlist.remove(0);
		System.out.println("Del front linkedlist takes " +(System.currentTimeMillis()-milis));
		
		//remove from mid
		
		milis = System.currentTimeMillis();
		arrayList.remove(1E5);
		arrayList.remove(1E5);
		arrayList.remove(1E5);
		System.out.println("Del mid arrayList takes " +(System.currentTimeMillis()-milis));
		
		milis = System.currentTimeMillis();
		linkedlist.remove(1E5);
		linkedlist.remove(1E5);
		linkedlist.remove(1E5);
		System.out.println("Del mid linkedlist takes " +(System.currentTimeMillis()-milis));
		
		//remove search 
		
		milis = System.currentTimeMillis();
		arrayList.get((int)n/2);
		System.out.println("get mid arrayList takes " +(System.currentTimeMillis()-milis));
		
		milis = System.currentTimeMillis();
		linkedlist.get((int)n/2);
		System.out.println("get mid linkedlist takes " +(System.currentTimeMillis()-milis));
		
		
		
		//modify search 
		
		milis = System.currentTimeMillis();
		arrayList.set((int)1E5, 1E6);
		linkedlist.set(15, 1E6);
		linkedlist.set((int)1E5, 10);
		System.out.println("modify mid arrayList takes " +(System.currentTimeMillis()-milis));
		
		milis = System.currentTimeMillis();
		linkedlist.set((int)1E5, 1E6);
		linkedlist.set(15, 1E6);
		linkedlist.set((int)1E5, 10);
		System.out.println("modify mid linkedlist takes " +(System.currentTimeMillis()-milis));
		
		
	}

}
