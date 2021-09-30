package PrimitiveObsession.replaceTypeCodeWithClass.solution;

public class Person {

	private BloodGroup bloodGroup;
	
	public Person(BloodGroup code) {
		bloodGroup=code;
	}
	
	public void setBloodGroup(BloodGroup code) {
		this.bloodGroup=code;
	}
	
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	
}
