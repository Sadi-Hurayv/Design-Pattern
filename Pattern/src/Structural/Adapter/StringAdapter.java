/**
 * 
 */
package Structural.Adapter;

/**
 * @author shuvra
 *
 */
public class StringAdapter extends IntegerNumber{
	
	private StringNumber stringNumber;
	
	public StringAdapter(StringNumber stringNumber) {
		this.stringNumber = stringNumber;
	}
	
	public int getInteger() {
		int intNum;
		String sNum = stringNumber.getString();
		intNum = Integer.parseInt(sNum);
		return intNum;
	}

}
