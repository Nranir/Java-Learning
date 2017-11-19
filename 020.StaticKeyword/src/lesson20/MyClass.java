package lesson20;

public class MyClass
{
	//what does the 'static' keyword do in a class
	public static void main(String[] args)
	{
		//static members belong to the class instead of a specific instance
		/*
		 * Podsumowujac:
		 * static oznacza, ze sa wykonywane dzialania na KLASIE a nie na obiekcie
		 * bez znacznika static metoda/zmienna jest zalezna od instancji
		 * a static powoduje zmiany na CA£EJ KLASIE
		 * 
		 * 
		 * w przypadku klasy NIE MOZNA uzywac metod które nie maja s³owa klucz 'static'
		 * w przypadku instancji NIE POWINNO sie uzywac metod ktore maja slowo klucz 'static'
		 */
		
		Hello hello = new Hello();
		Hello hello1 = new Hello();
		
		//tak powinno sie uzywac metod z 'static' (czyli nazwa klasy a nie instancji)
		Hello.DoSomething("Hi youtube");

		//tak powinno sie uzywac metod bez 'static' (nazwa instancji)
		hello.DoSomethingElse("hello world");
		
		//tak NIE powinno sie uzywac zmiennych z 'static' 
		hello.age= 10;
		
		System.out.println(hello.age);
		
		hello1.age =50;
		System.out.println(hello1.age);
		System.out.println(hello.age);
		
		//tak powinno sie uzywac zmniennych z 'static'
		Hello.age = 15;
		System.out.println(Hello.age);
		
		
		
	}

}
