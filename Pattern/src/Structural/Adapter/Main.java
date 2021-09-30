/**
 * 
 */
package Structural.Adapter;

/**
 * @author shuvra
 *
 */
public class Main {

	public static void main(String[] args) {
		int iNum = 4;
		String sNum = "6";
		
		Square s = new Square();
		
		IntegerNumber intNum = new IntegerNumber(iNum);
		System.out.println("From integer number: square of " + iNum + " : " + s.calculateSquare(intNum));
		
//		StringNumber striNum = new StringNumber(sNum);
//		System.out.println("From integer number: square of " + iNum + " : " + s.calculateSquare(striNum));
		
		StringNumber striNum = new StringNumber(sNum);
		StringAdapter sa = new StringAdapter(striNum);
		System.out.println("From string number: square of " + sNum + " : " + s.calculateSquare(sa));
		
		

	}

}
