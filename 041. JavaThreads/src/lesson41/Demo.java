package lesson41;
//utworzenie klasy która dziedziczy po klasie Thread i implementuje metode run() tak aby przy utworzeniu nowej instancji klasy
//metoda Thread.currentThread().getId() - pokazuje id konkretnego w¹tku/thread
class MyClass extends Thread 
{

	@Override
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+ " Value "+ i);
		}
		try
		{
			//wstrzymuje watek na 100ms
			Thread.sleep(100);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class Demo
{

	public static void main(String[] args)
	{
		MyClass myClass = new MyClass();
		myClass.start();
		MyClass myClass2 = new MyClass();
		myClass2.start();
		
	}

}
