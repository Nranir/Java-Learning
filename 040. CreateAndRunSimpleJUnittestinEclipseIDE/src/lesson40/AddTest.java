package lesson40;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest
{

	@Test
	public void Addtest()
	{
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result); // pierwszy parametr to to co my sie spodziewamy, a po prawej wynik
		
	}

}
