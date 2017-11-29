package lesson40;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest
{

	@Test
	public void Concattest()
	{
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.ConCat("Hello","World");
		assertEquals("HelloWorld", result); // pierwszy parametr to to co my sie spodziewamy, a po prawej wynik
	}

}
