
package cse360assign3;

/**
 * This program will set the total to zero when Calculator is initialized.
 * It will do basic mathematics such as addition, subtraction, division,
 * and multiplication.It will take in any integer and do the calculation 
 * with the total. It will update the total when ever any calculation is
 * being made.
 * When the total is being divided by zero, the total will be set to zero.
 * 
 * @author Loi Nguyen
 * @Since 2016-02-22
 */

public class Calculator {

	private int total;
	
	
	/**
	 * This method will initialize Calculator and set total to zero.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method will return the current total in Calculator.
	 * 
	 * @return	zero (for now)
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This method will add the value to the total and update the
	 * total.
	 * 
	 * @param value			The value being added to total 
	 */
	public void add (int value) {
		
	}
	
	
	/**
	 * This method will subtract the value from the total and 
	 * update the total.
	 * 
	 * @param value			The value use to subtract from the total
	 */
	public void subtract (int value) {
		
	}
	
	
	/**
	 * This method will multiply the value to the total and update
	 * the total.
	 *  
	 * @param value			The value multiply to the total
	 */
	public void multiply (int value) {
		
	}
	
	
	/**
	 * This method will divide the value from the total and 
	 * update the total.
	 *  
	 * @param value			The value use to divide from the total
	 */
	public void divide (int value) {
		
	}
	
	
	/**
	 * This method will return the history of the methods and number
	 * that has been used.
	 *  
	 * @return				Empty string (for now)
	 */
	public String getHistory () {
		return "";
	}
}
