package lesson43;

//java thread join method can be used to pause the current thread execution until unless the specified thread is dead
//synchronized zezwala na dostep do danej zmiennej przez parê w¹tków. 
public class Demo
{
	private static int count =0;
	
	public static synchronized void inccount()
	{
		count++;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread t1 = new Thread (new Runnable() 
		{

			@Override
			public void run()
			{
				for(int i=0; i <10000; i++)
				{
					//count++;
					inccount();
				}
			}
			
		});
		
		Thread t2 = new Thread (new Runnable() 
		{

			@Override
			public void run()
			{
				for(int i=0; i <10000; i++)
				{
					//count++;
					inccount();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("value: " + count);
		
	}

	

}
