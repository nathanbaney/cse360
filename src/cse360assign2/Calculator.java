/**
 * @author Nathan Baney
 * ClassID: 322
 * Calculator class for assignment 2
 */
package cse360assign2;

public class Calculator {

	private int total;

	/**
	 * Constructor method
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}

	/**
	 * Returns the current accumulated total
	 * @return The current calculated amount
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * Adds the parameter to the current total
	 * @param value The amount to be added
	 */
	public void add (int value) {
		total += value;
	}

	/**
	 * Subtracts the parameter from the current total
	 * @param value The amount to subtract
	 */
	public void subtract (int value) {
		total -= value;
	}

	/**
	 * Multiplies the current total by the parameter
	 * @param value The multiplier to be applied
	 */
	public void multiply (int value) {
		if (value == 0){
			total = 0;
		}else{
			total = total / value;
		}
	}

	/**
	 * Divides the current total by the parameter
	 * @param value The dividend to be applied
	 */
	public void divide (int value) {
		total = total / value;
	}

	/**
	 * Returns a string printout of the operations applied to the total
	 * @return The string representation of the operation history
	 */
	public String getHistory () {
		return "";
	}
}
