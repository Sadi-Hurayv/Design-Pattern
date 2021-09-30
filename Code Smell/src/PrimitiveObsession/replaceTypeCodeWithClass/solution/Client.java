package PrimitiveObsession.replaceTypeCodeWithClass.solution;

public class Client {
	
	public static void main(String[] args) {
		Person parent = new Person(BloodGroup.O());
		
		Person child = new Person(null);
		
		//Imaginary world this below condition is possible
		if(parent.getBloodGroup().getCode() == BloodGroup.O().getCode()) {
			//System.out.println("Yeah");
			child.setBloodGroup(parent.getBloodGroup());
		}
		
		//Testing if the code is working rightly.
		System.out.println("Parent Blood group is "+parent.getBloodGroup().getCode());
		System.out.println("Child Blood group is "+child.getBloodGroup().getCode());
	}

}
