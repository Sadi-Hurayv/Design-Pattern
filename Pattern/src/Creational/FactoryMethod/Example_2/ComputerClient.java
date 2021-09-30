/**
 * 
 */
package Creational.FactoryMethod.Example_2;

import java.util.Scanner;

/**
 * @author shuvra
 *
 */
public class ComputerClient {

	public static void main(String[] args) {
		
		String type;
		Scanner sc = new Scanner(System.in);
		type = sc.nextLine();
		
		System.out.println("Factory Method useing the concrete factory!!!");
		
		if(type.equalsIgnoreCase("pc")) {
			ComputerFactory pcFactory = new PCFactory("2 GB","512 GB","2.4 GHz");
			Computer pc = pcFactory.createComputer();
			System.out.println("Factory pc configuration: " + pc);
		}
		else if(type.equalsIgnoreCase("server")) {
			ComputerFactory serverFactory = new ServerFactory("32 GB","5 TB","2.4 GHz");
			Computer server = serverFactory.createComputer();
			System.out.println("Factory server configuration: " + server);
		}
		else if(type.equalsIgnoreCase("supercomputer")) {
			ComputerFactory superComputerFactory = new SuperComputerFactory("512 GB","256 TB","2.4 GHz");
			Computer superComputer = superComputerFactory.createComputer();
			System.out.println("Factory super computer configuration: " + superComputer);
		}
		
		
		
		
		
		
		
		
	}

}
