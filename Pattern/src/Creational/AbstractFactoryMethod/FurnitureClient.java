/**
 * 
 */
package Creational.AbstractFactoryMethod;

/**
 * @author shuvra
 *
 */
public class FurnitureClient {
	
	Table table;
	Chair chair;
	
	public FurnitureClient(FurnitureAbstractFactory factory) {
		table=factory.createTable();
		chair=factory.createChair();
	}
	
	public void conformation() {
		table.conformation();
		chair.conformation();
	}

}
