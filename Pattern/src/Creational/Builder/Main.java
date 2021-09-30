/**
 * 
 */
package Creational.Builder;

/**
 * @author shuvra
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director d1 = new Director("SHUVRA");
		d1.setAge("22");
		d1.setPhone("01X839X345X");
		d1.setAddress("Laxmipur");
		d1.execute();
		
		Director d2 = new Director("SHEKH");
		d2.setAge("23");
		d2.setPhone("01X452X989X");
		d2.execute();
		
		Director d3 = new Director("Asif");
		d3.setAge("21");
		d3.execute();
		
		Director d4 = new Director("Robi");
		d4.execute();
		
	}

}
