package lesson21;

public class Student
{
	String name;
	int age;
	static int NoOfStudents=0;
	
	Student()
	{
		NoOfStudents++;
	}
	
	public static int getNoOfStudents()
	{
		return NoOfStudents;
	}

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
