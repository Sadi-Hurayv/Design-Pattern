/**
 * 
 */
package Structural.Adapter;

/**
 * @author shuvra
 *
 */
public class Square {
	
	public Square() {
	}
	
	public double calculateSquare(IntegerNumber integerNumber) {
		int num;
		double sq;
		num = integerNumber.getInteger();
		sq = Math.pow(num, 2);
		return sq;
	}
	
}
