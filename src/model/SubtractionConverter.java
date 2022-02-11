/**
 * @author theaw - mcorralledezma@dmacc.edu
 * CIS175 - Spring 2022
 * Feb 10, 2022
 */
package model;

/**
 * @author theaw
 *
 */
public class SubtractionConverter {
	private int number;
	/**
	 * 
	 */
	public SubtractionConverter() {
	}
	public SubtractionConverter(int number) {
		super();
		this.number = number;
		setSubtraction(number);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setSubtraction(int number) {
		final int subtraction = 5;
		setNumber(number-subtraction);
	}
	@Override
	public String toString() {
		return "SubtractionConverter [number=" + number + "]";
	}
	

}
