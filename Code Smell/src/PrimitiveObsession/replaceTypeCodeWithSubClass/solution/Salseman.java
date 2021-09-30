package PrimitiveObsession.replaceTypeCodeWithSubClass.solution;

public class Salseman extends Employee {

	
	public int commission;
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Employee.SALESMAN;
	}
	
	public int payAmount() {
		return monthlySalary+commission;
	}

}
