package Behavioral.Template;

public class Server extends ComputerTemplate{

	@Override
	protected void installOS() {
		// TODO Auto-generated method stub
		System.out.println("Ubuntu is installed.");
	}

	@Override
	protected void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Components are assembled with 0 HDMI port and 4 VGA port.");
	}

	@Override
	protected void collectComponents() {
		// TODO Auto-generated method stub
		System.out.println("Components are 8GB Ram, 6TB HDD, 4GB Graphics, i9 processor.");
	}

}
