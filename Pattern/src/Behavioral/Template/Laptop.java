package Behavioral.Template;

public class Laptop extends ComputerTemplate{

	@Override
	protected void installOS() {
		// TODO Auto-generated method stub
		System.out.println("Windows is installed.");
	}

	@Override
	protected void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Components are assembled with 2 HDMI port.");
	}

	@Override
	protected void collectComponents() {
		// TODO Auto-generated method stub
		System.out.println("Components are 4GB Ram, 1TB HDD, 4GB Graphics, i7 processor.");
	}

}
