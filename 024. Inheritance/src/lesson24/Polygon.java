package lesson24;

public class Polygon
{
	/* * Access levels
	 * Modifier			Class		Package		SubClass		World
	 * public			Y			Y			Y				Y
	 * protected		Y			Y			Y				N
	 * no modifier		Y			Y			N				N
	 * private			Y			N			N				N
	 */
	
	/* Wszystkie zmienne protected sa dziedziczone przez klasy dziedziczace
	 * 
	 */
	
	protected int height;
	protected int width;
	
	public void set_values(int height, int width)
	{
		this.height = height;
		this.width= width;
	}

}
