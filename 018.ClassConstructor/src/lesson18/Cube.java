package lesson18;

public class Cube
{
	int length;
	int bredth;
	int height;
	
	public int getCubeVolume()
	{
		return (length*bredth*height);
	}
	
	//konstruktor ma taka sama nazwe jak klasa
	//bez parametrow to taki standardowy
	Cube()
	{
		//System.out.println("We are in constructor");
		length=10;
		bredth=20;
		height=30;
	}
	//overloading constructor - mozna dodawac rozna parametry
	Cube(int l, int b, int h)
	{
		//System.out.println("We are in constructor");
		length=l;
		bredth=b;
		height=h;
	}
	
}
