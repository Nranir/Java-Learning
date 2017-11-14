package lesson6;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x = 10;
		x=x+1;
		System.out.println("x=x+1 " + x);
		x++;
		System.out.println("x++ " + x);
		System.out.println(x++);//zostanie dodane dopiero po wykonaniu komendy
		System.out.println(++x);//zostanie dodane przed wykonaniem komendy
		
		
		x=10;
		x+=5;
		System.out.println(x);
		x*=5; //x=x*5
		System.out.println(x);
		x/=5; //x=x/5;
		System.out.println(x);
		x-=5; // x=x-5;
		System.out.println(x);
		
	}

}
