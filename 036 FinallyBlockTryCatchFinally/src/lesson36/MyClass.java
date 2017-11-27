package lesson36;
//finally zawsze sie wykonuje
public class MyClass
{
	@SuppressWarnings("finally")
	public static int retInt()
	{
		int a=100;
		try 
		{
			a= a/0;
			return a;
			//System.exit(1);
		}
		catch (ArithmeticException e)
		{
			System.out.println("catch called");
			System.out.println(e);
			return a;
		}
		finally
		{
			a= 5000;
			System.out.println("Finally called");
			return a;
		
		}
		
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(retInt());
	}

}
