package lesson17;



public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Student Mark =new Student(); // mark -> object or instance
		Mark.id=1;
		Mark.name="Mark";
		Mark.age=15;
		System.out.println(Mark.name + " is "+Mark.age +" years old");
		
		
		Student Tom =new Student(); // mark -> object or instance
		Tom.id=2;
		Tom.name="Tom";
		Tom.age=14;
		System.out.println(Tom.name + " is "+Tom.age +" years old");
		
		Mark.setAge(15);
		Mark.setName("Mark");
		Mark.setId(1);
		System.out.println(Mark.getName()+ " is "+Mark.getAge());
		
		
	}
	

}
