/**
 * 
 */
package OCP.Solution;

/**
 * @author shuvra
 *
 */
public class Circle implements Shape {

	public double radious;
	public Circle(double radious) {
		this.radious=radious;
	}
	
	@Override
	public void calculateArea() {
		System.out.println((22.0/7.0) * radious * radious);
	}

}
