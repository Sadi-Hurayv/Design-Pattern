package PrimitiveObsession.replaceDataValuewithObject.solution;

public class TotalSalary {
	
	private double totalSalary;
	private BaseSalary baseSalary;
	private MedicalAllowance medicalAllowance;
	private HouseRentAllowance houseRentAllowance;

	public BaseSalary getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double base) {
		this.baseSalary = new BaseSalary(base);
	}

	public MedicalAllowance getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = new MedicalAllowance(medicalAllowance);
	}

	public HouseRentAllowance getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(double houseRentAllowance) {
		this.houseRentAllowance = new HouseRentAllowance(houseRentAllowance);
	}
	
	public double calculateTotalSalary() {
		totalSalary=baseSalary.getBase() + medicalAllowance.getMedical() + houseRentAllowance.getHouseRent();
		return totalSalary;
	}

}
