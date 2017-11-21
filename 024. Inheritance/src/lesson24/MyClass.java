package lesson24;

public class MyClass
{
	/*
	 * Classes in Java can be extended
	 * creating a new class which retain 
	 * characteristics of the base class
	 * 
	 * is - a property
	 * rectangle is a polygon
	 * a triangle is a polygon
	 */
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(10, 10);
		tri.set_values(10, 10);
		
		System.out.println(rec.area()+ " "+ tri.area());
	}

}
