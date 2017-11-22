package lesson25;

public class MyClass
{
	
	//polimorphism - obiekt moze miec wiele form
	//polimophism - oznacza, ¿e klasa nadrzêdna mo¿na utworzyæ obiekty klas podrzêdnych których metody bêd¹ pokrywa³y 
	//metody klasy nadrzêdnej
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 BANK abc = new Bank_ABC();
		 BANK def = new BANK_DEF();
		 BANK xyz = new BANK_XYZ();
		 
		 System.out.println(abc.getIntrestRate());
		 System.out.println(def.getIntrestRate());
		 System.out.println(xyz.getIntrestRate());

	}

}
