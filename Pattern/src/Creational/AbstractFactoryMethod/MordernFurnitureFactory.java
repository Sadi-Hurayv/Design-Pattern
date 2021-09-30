/**
 * 
 */
package Creational.AbstractFactoryMethod;

/**
 * @author shuvra
 *
 */
public class MordernFurnitureFactory implements FurnitureAbstractFactory {

	@Override
	public Table createTable() {
		return new MordernTable();
	}

	@Override
	public Chair createChair() {
		return new MordernChair();
	}

}
