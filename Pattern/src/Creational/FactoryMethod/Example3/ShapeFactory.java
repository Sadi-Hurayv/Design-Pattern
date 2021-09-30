/**
 * 
 */
package Creational.FactoryMethod.Example3;

/**
 * @author shuvra
 *
 */
public class ShapeFactory {
	public Shape createShape(ShapeType type) {
		Shape comp = null;
		switch(type) {
			case CIRCLE:
				comp = new Circle();
				break;
			case RECTANGLE:
				comp = new Rectangle();
				break;
			case TRIANGLE:
				comp = new Triangle();
				break;
		}
		return comp;
	}
}
