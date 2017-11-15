package lesson9;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int score = 100;
		//byte short int or char
		switch(score)
		{
			case 100 :
				System.out.println("Excellent");
			case 90 :
				System.out.println("very good");
				break;
			case 60:
				System.out.println("good");
				break;
			case 40:
				System.out.println("ok");
				break;
			default :
				System.out.println("The grades are not defined");
				break;
		}

	}

}
