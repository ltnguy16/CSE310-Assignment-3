package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test		//Test to make sure Calculator is not null when initialized
	public void testCalculator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}
	
	@Test		//Test to see if returning the correct total
	public void testTotal(){
		Calculator test = new Calculator();
		test.add(7);
		assertEquals(7, test.getTotal());
	
	}
	
	@Test		//Test to see if number is being added correctly
	public void testAdd(){
		Calculator test = new Calculator();
		test.add(7);
		assertEquals(7, test.getTotal());
		test.add(17);
		assertEquals(24, test.getTotal());
		test.add(6);
		assertEquals(30, test.getTotal());
	}
	
	@Test		//Test to see if number is being subtracted correctly 
	public void testSubtract(){
		Calculator test = new Calculator();
		test.add(40);
		test.subtract(10);
		assertEquals(30, test.getTotal());
		test.subtract(7);
		assertEquals(23, test.getTotal());
		test.subtract(27);
		assertEquals(-4, test.getTotal());
	}
	
	@Test		//Test to see if number is being multiplied correctly
	public void testMultiply(){
		Calculator test = new Calculator();
		test.multiply(7);
		assertEquals(0 , test.getTotal());
		test.add(10);
		test.multiply(2);
		assertEquals(20, test.getTotal());
		test.multiply(-4);
		assertEquals(-80, test.getTotal());
	}
	
	@Test		//Test to see if number is being divided correctly
	public void testDivide(){
		Calculator test = new Calculator();
		test.divide(2);
		assertEquals(0, test.getTotal());
		test.add(10);
		test.divide(2);
		assertEquals(5, test.getTotal());
		test.add(5);
		test.divide(-5);
		assertEquals(-2, test.getTotal());
	}
	
	@Test		//Test to see if the correct history is being returned
	public void testHistory(){
		Calculator test = new Calculator();
		assertEquals("0", test.getHistory());
		test.add(30);
		assertEquals("0 + 30", test.getHistory());
		test.subtract(15);
		assertEquals("0 + 30 - 15", test.getHistory());
		test.multiply(2);
		assertEquals("0 + 30 - 15 * 2", test.getHistory());
		test.divide(-5);
		assertEquals("0 + 30 - 15 * 2 / -5", test.getHistory());
		test.divide(0);
		assertEquals("0 + 30 - 15 * 2 / -5 / 0", test.getHistory());
		test.add(18);
		assertEquals("0 + 30 - 15 * 2 / -5 / 0 + 18", test.getHistory());
		assertEquals(18, test.getTotal());
	}
}
