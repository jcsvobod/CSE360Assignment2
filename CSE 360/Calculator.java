/**
 * 
 */
/**
 * @author Johnathon Svoboda
 *
 */
package cse360assign2;

/**
 * This class contains seven methods. 
 * The first method, Calculator() is the constructor which sets the total
 * variable's value to zero (initializes it).
 * The second method, getTotal() is a get method which returns the total
 * variable's current value.
 * The third method, add() takes in an integer as a parameter and adds it
 * to the current value of total.
 * The fourth method, subtract() takes in an integer as a parameter and 
 * subtracts it from the current value of total.
 * The fifth method, multiply() takes in an integer as a parameter and
 * multiplies it by the current value of total.
 * The sixth method, divide() takes in an integer as a parameter and 
 * divides the current total value by this parameter.
 * The last method, getHistory() returns an empty string (for now).
 * @param total This is used to keep track of the total value on which 
 * various operations (through the different methods) are performed.
 * @param toString This is used to keep track of all the operations of
 * performed on the total variable and is used by the getHistory() method
 * to print a list of these operations.
 */
public class Calculator {

	/**
	 * An integer which is used to keep track of the total value.
	 */
	private int total;
	
	/**
	 * A string which is used to keep track of all operations performed
	 * on the total.
	 */	
	private String toString = "0";
	
	/**
	 * The constructor method which sets the total value to zero.
	 */
	public Calculator () {
		
		total = 0;  // not needed - included for clarity
		
	}
	
	/**
	 * A get method which returns the current total value.
	 */
	public int getTotal () {
		
		return total;
		
	}
	
	/**
	 * A  method which adds the given parameter with the total variable.
	 */
	public void add (int value) {
		
		total += value;
		toString += (" + " + value);
		
	}
	
	/**
	 * A method which subtracts the given parameter from the total variable.
	 */
	public void subtract (int value) {
		
		total -= value;
		toString += (" - " + value);

	}
	
	/**
	 * A method which multiplies the given parameter with the total variable.
	 */
	public void multiply (int value) {
		
		total *= value;
		toString += (" * " + value);
		
	}
	
	/**
	 * A method which divides the total variable by the given parameter.
	 */
	public void divide (int value) {
		
		if (value == 0) 
			total = 0;
		else 
			total /= value;
		
		toString += (" / " + value);
		
	}
	
	/**
	 * A get method which returns a record of all operations performed
	 * on the total variable.
	 */
	public String getHistory () {
		
		return toString;
		
	}
}
