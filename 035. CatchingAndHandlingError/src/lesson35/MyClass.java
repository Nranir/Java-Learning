package lesson35;
//def: an exception is an event, which occurs during the exectuion of a 
// program, that disrupts the normal flow of the programs instruction
public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int b[] = new int[2];
		try {
		//int a=100/0;
		System.out.println(b[3]);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			//System.out.println("you cannot divide by 0!");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		System.out.println("-------------");
	}

}
