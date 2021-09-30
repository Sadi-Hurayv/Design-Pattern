/**
 * 
 */
package DIP.Solution;

/**
 * @author shuvra
 *
 */
public class Address {
	
	public String district, postCode;

	public Address(String district, String postCode) {
		this.district = district;
		this.postCode = postCode;
	}
	
	public void printAddress() {
		System.out.println("District: "+district);
		System.out.println("Post Code: "+postCode);
	}
	

}
