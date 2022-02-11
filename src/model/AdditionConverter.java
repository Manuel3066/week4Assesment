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
public class AdditionConverter {
	private int number;
	
	public AdditionConverter() {
		super();
	}
	public AdditionConverter(int number) {
		this.number = number;
		setAddition(number);
	}
	
	
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setAddition(int number) {
		final int addition = 5;
		
		setNumber(number+addition);
		
		
		
	}
	@Override
	public String toString() {
		return "AdditionConverter [number=" + number + "]";
	}
	
	

}
