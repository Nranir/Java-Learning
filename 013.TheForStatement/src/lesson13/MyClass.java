package lesson13;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] myintarray = {100,31,26,48,52};
		//for (init; expression;increment)
		for(int i=0;i<5;i++)
		{
			System.out.println(myintarray[i]);
		}
		
		//other way to go through array? for each?
		for (int element : myintarray)
		{
			System.out.println(element);
		}

	}

}
