package lesson23;

// public class Hello extends Student - nie mozliwe jezeli klasa student jest final
//dziedziczenie klasy jest niemozliwe, poniewa¿ klasa nadrzedna posiada "final"
public class Hello
{
	public final int number ;
	
	Hello()
	{
		number = 10;
	}
}
