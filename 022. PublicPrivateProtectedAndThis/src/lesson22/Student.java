package lesson22;

/*
 * Access levels
 * Modifier			Class		Package		SubClass		World
 * public			Y			Y			Y				Y
 * protected		Y			Y			Y				N
 * no modifier		Y			Y			N				N
 * private			Y			N			N				N
 * 
 * 
 * this.name 
 * this.age - oznacza, ze ta zmienna nalezy do tej klasy		
 * 
 */
public class Student
{

	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	
	
}
