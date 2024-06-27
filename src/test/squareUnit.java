package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		UnitTest obj1 = new UnitTest();
		int output_f = obj1.square(5);
		assertEquals(25,output_f);
	}

}
