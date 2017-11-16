package lesson12;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [] myintarray= {1,2,3,4,5}; //array // preffered
		//int myintarray2[]= {1};
		//int[] myIntArray = new int[3];
		//int[] myIntArray = {1,2,3};
		//int[] myIntArray = new Int[]{1,2,3};
		System.out.println(myintarray[2]);
		int index=0;
		while(index<5)
		{
			System.out.println(myintarray[index]);
			index++;
		}
		
	}

}
