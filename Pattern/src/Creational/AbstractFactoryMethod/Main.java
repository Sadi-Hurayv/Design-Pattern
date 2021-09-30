/**
 * 
 */
package Creational.AbstractFactoryMethod;

import java.util.Scanner;

/**
 * @author shuvra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FurnitureClient furnitureClient =  Configuration();
		furnitureClient.conformation();
	}
	
	public static FurnitureClient Configuration() {
		FurnitureAbstractFactory factory;
		FurnitureClient furnitureClient;
		String furnitureType;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the furniture type: ");
		furnitureType = sc.nextLine().toLowerCase();
		sc.close();
		
		if(furnitureType.contains("mordern")) {
			factory = new MordernFurnitureFactory();
		}
		else if(furnitureType.contains("victorian")) {
			factory = new VictorianFurnitureFactory();
		}
		else {
			factory = null;
			System.out.println("There is not available this type of furniture.");
		}
		
		furnitureClient = new FurnitureClient(factory);
		return furnitureClient;
	}

}
