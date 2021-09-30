/**
 * 
 */
package Creational.Builder;

/**
 * @author shuvra
 *
 */
public class User {
	
	private String name, age, phone, address;
	
	public User(UserBuilder builder) {
		this.name = builder.getName();
		this.age = builder.getAge();
		this.phone = builder.getPhone();
		this.address = builder.getAddress();
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

	@Override
	//this toString method will skip null values
	public String toString() {
		return "User [" + (name != null ? "name=" + name + ", " : "") + (age != null ? "age=" + age + ", " : "")
				+ (phone != null ? "phone=" + phone + ", " : "") + (address != null ? "address=" + address : "") + "]";
	}
	
//	public static class USERBUILDER {
//		
//		String age, phone, address;
//		
//		public USERBUILDER setAge(String age) {
//			this.age = age;
//			return this;
//		}
//
//		public USERBUILDER setPhone(String phone) {
//			this.phone = phone;
//			return this;
//		}
//
//		public USERBUILDER setAddress(String address) {
//			this.address = address;
//			return this;
//		}
//		
//		public User build() {
//			return new User();
//		}
//		
//	}
	
	
}
