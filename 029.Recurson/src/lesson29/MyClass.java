package lesson29;

public class MyClass
{
	// N! = N * (n-1) * (n-1) ... *2 *1 // factorial
	//recursion odpalania funkcji w niej samej
	public static int factorial(int N)
	{
		if(N<=1) 
		{
			return 1;
		}
		else
		{
			return N*factorial(N-1);
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//int sum = add(23,10);
		int sum = factorial(5);
		System.out.println(sum);
	}

}
