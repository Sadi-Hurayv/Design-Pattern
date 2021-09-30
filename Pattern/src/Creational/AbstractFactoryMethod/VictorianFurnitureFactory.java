/**
 * 
 */
package Creational.AbstractFactoryMethod;

/**
 * @author shuvra
 *
 */
public class VictorianFurnitureFactory implements FurnitureAbstractFactory {

	@Override
	public Table createTable() {
		return new VictorianTable();
	}

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

}
