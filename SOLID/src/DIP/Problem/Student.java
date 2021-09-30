/**
 * 
 */
package DIP.Problem;

/**
 * @author shuvra
 *
 */
public class Student {
	
	Address address;
	String name, district, postCode;
	
	public Student(String name, String district, String postCode) {
		this.name = name;
		this.district = district;
		this.postCode = postCode;
		this.address = new Address(district, postCode);
	}
	
	public void studentDetails() {
		System.out.println("Name: "+name);
		address.printAddress();
	}
	
	
	
}
