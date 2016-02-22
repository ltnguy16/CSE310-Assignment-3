
package cse360assign3;

/**
 * This program will set the total to zero when Calculator is initialized.
 * It will do basic mathematics such as addition, subtraction, division,
 * and multiplication.It will take in any integer and do the calculation 
 * with the total. It will update the total when ever any calculation is
 * being made.
 * When the total is being divided by zero, the total will be set to zero.
 * It will also print out all of the process made in the program so far.  
 * 
 * @author Loi Nguyen
 * @Since 2016-02-22
 */

public class Calculator {

	private int total;
	private String output;
	
	/**
	 * This method will initialize Calculator and set total to zero.
	 * Initialize the output to show total as 1st number. 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		output ="" + total;
	}
	
	/**
	 * This method will return the current total in Calculator.
	 * 
	 * @return				The total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method will add the value to the total and update the
	 * total.
	 * Update the output.
	 * 
	 * @param value			The value being added to total 
	 */
	public void add (int value) {
		total += value;
		output += " + " + value;
	}
	
	
	/**
	 * This method will subtract the value from the total and 
	 * update the total.
	 * Update the output.
	 * 
	 * @param value			The value use to subtract from the total
	 */
	public void subtract (int value) {
		total -= value;
		output += " - " + value;
	}
	
	
	/**
	 * This method will multiply the value to the total and update
	 * the total.
	 * Update the output.
	 *  
	 * @param value			The value multiply to the total
	 */
	public void multiply (int value) {
		total *= value;
		output += " * " + value;
	}
	
	
	/**
	 * This method will divide the value from the total and 
	 * update the total.
	 * It will set total to zero if total is divided by 0 
	 * Update the output.
	 * 
	 * @param value			The value use to divide from the total
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else 
			total /= value;
		
		output += " / " + value;
	}
	
	/**
	 * This method will return the history of the methods and number
	 * that has been used.
	 *  
	 * @return output		all the methods and value used for calculation
	 */
	public String getHistory () {
		return output;
	}
}
