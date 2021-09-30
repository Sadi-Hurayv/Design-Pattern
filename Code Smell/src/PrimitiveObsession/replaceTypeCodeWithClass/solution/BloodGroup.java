package PrimitiveObsession.replaceTypeCodeWithClass.solution;

public class BloodGroup {

	private final int code;
	
	private BloodGroup(int code) {
		// TODO Auto-generated constructor stub
		this.code=code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public static BloodGroup O() {
		return new BloodGroup(0);
	}
	
	public static BloodGroup A() {
		return new BloodGroup(1);
	}
	
	public static BloodGroup B() {
		return new BloodGroup(2);
	}
	
	public static BloodGroup AB() {
		return new BloodGroup(3);
	}
	
}
