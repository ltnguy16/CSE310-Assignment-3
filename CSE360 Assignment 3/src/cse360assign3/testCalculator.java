package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {

	@Test		//Test to make sure Calculator is not null when initialized
	public void Calculator_test_null() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}
	
	@Test		//Test to see if returning the correct total
	public void Total_test(){
		Calculator test = new Calculator();
		test.add(7);
		assertEquals(7, test.getTotal());
	
	}
	
	@Test		//Test to see if number is being added correctly
	public void Add_test(){
		Calculator test = new Calculator();
		test.add(7);
		assertEquals(7, test.getTotal());
		test.add(17);
		assertEquals(24, test.getTotal());
		test.add(6);
		assertEquals(30, test.getTotal());
	}
	
	@Test		//Test to see if number is being subtracted correctly 
	public void Subtract_test(){
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
	public void Multiply_test(){
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
	public void Divide_test(){
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
	public void History_test(){
		fail("Not yet implemented");
	}

}
