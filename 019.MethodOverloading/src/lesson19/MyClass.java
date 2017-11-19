package lesson19;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(Add(1,2));
		System.out.println(Add(1.2, 1.3));
		System.out.println(Add("x", "y"));
	}
	
	public static int Add(int a, int b)
	{
		return (a+b);
	}
	
	public static double Add(double a, double b)
	{
		return (a+b);
	}
	
	public static String Add(String a, String b)
	{
		return (a+b);
	}

}
