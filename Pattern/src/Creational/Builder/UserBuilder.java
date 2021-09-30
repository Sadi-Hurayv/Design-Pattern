/**
 * 
 */
package Creational.Builder;

/**
 * @author shuvra
 *
 */
public class UserBuilder {
	
	private String name, age, phone, address;

	public UserBuilder(String name) { //User name is essential property of user. Thats why name is in constructor.
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	//The mathod name could be getUser()	
	public User buildUser() {
		return new User(this);
	}

}
