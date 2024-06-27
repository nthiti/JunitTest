package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumUnit {

	@Test
	public void test() {
		UnitTest obj1 = new UnitTest();
		int output_f = obj1.sum(5,10);
		assertEquals(15,output_f);
	}

}
