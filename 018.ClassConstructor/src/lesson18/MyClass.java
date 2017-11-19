package lesson18;

public class MyClass
{

	public static void main(String[] args)
	{
		Cube cube1 = new Cube();
		System.out.println(cube1.getCubeVolume());
		Cube cube2 = new Cube(1,2,3);
		System.out.println(cube2.getCubeVolume());
	}
	

}
