package lesson14;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String myString = "Hello World";
		int myStringLength=myString.length();
		String myStringinLowerCase=myString.toLowerCase();
		String myStringinUpperCase=myString.toUpperCase();
		System.out.println(myString+" "+myStringLength+" "+myStringinLowerCase+" "+myStringinUpperCase);
		String myString2="hello"+" world";
		System.out.println(myString2);
		
		System.out.println(myString.replace('e', 'a'));
		
	}

}
