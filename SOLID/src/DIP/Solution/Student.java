/**
 * 
 */
package DIP.Solution;

/**
 * @author shuvra
 *
 */
public class Student {
	
	Address address;
	String name, district, postCode;
	
	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public void studentDetails() {
		System.out.println("Name: "+name);
		address.printAddress();
	}
	
	
	
}
