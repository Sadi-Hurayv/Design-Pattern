/**
 * 
 */
package Creational.Builder;

import java.lang.module.ModuleDescriptor.Builder;

/**
 * @author shuvra
 *	
 *	Director class don't send or set null or unnecessary value or properties to the Builder class. 
 *	Sometimes this filtration process based on some condition. 
 */
public class Director {
	
	UserBuilder builder;
	// Constructor
	public Director(String name) {
		builder = new UserBuilder(name);
	}
	
	public void setAge(String age) {
		builder.setAge(age);
	}
	
	public void setPhone(String phone) {
		builder.setPhone(phone);
	}
	
	public void setAddress(String address) {
		builder.setAddress(address);
	}
	
	public void execute() {
		builder.buildUser();
		System.out.println(builder.buildUser());
	}
	
	
//.........................Another way...................
	
//	private String name, age, phone, address;
//	
//	public Director(String name) {
//		this.name=name;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public void setAddrs(String address) {
//		this.address = address;
//	}
//	
//	public void execute() {
//		UserBuilder builder = new UserBuilder(this.name);
//		builder.setAge(this.age);
//		builder.setPhone(this.phone);
//		builder.setAddress(this.address);
//		builder.buildUser();
//		System.out.println(builder.buildUser());
//	}
	
}
