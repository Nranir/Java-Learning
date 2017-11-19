package lesson16;
public class MyClass

{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sayHello("aaa");
		sayHello("John");
		Add(2,2);
		int sum=Add(1, 1);
		System.out.println(sum);
		Substract(-1, -13, 500, -1000);

		
	}
	public static void sayHello(String name)
	{
		System.out.println("hello "+name);
	}
	public static int Add(int a, int b) 
	{
		System.out.println(a+b);
		return a+b;
	}
	
	public static void Substract(int...numbers )
	{
		int sum=0;
		for(int argz: numbers)
		{
			sum-=argz;
		}
		System.out.println(sum);
	}

}