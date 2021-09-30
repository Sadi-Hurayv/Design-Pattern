package Behavioral.NullObject;

public class RealCustomer extends Customer{

	public RealCustomer(String name) {
		this.name=name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNull() {
		return false;
	}
}
