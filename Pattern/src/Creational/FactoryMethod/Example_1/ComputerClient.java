/**
 * 
 */
package Creational.FactoryMethod.Example_1;

import java.util.Scanner;

/**
 * @author shuvra
 *
 */
public class ComputerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Go to the computer factory for details information.
		
//		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "2 GB","500 GB","2.4 GHz");
//		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32 GB","5 TB","2.4 GHz");
//		Computer superComputer = ComputerFactory.createComputer(ComputerType.SERVER, "512 GB","256 TB","2.4 GHz");
		String type;
		Scanner sc = new Scanner(System.in);
		type = sc.nextLine();
		
		if(type.equalsIgnoreCase("pc")) {
			
		}
		else if(type.equalsIgnoreCase("server")) {
			
		}
		else if(type.equalsIgnoreCase("supercomputer")) {
			
		}
		
		Computer pc = ComputerFactory.createComputer(new PC("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.createComputer(new Server("2 GB","500 GB","2.4 GHz"));
		Computer superComputer = ComputerFactory.createComputer(new SuperComputer("2 GB","500 GB","2.4 GHz"));
		
		System.out.println("Factory Method!!!");
		System.out.println("Factory pc configuration: " + pc);
		System.out.println("Factory server configuration: " + server);
		System.out.println("Factory super computer configuration: " + superComputer);

	}

}
