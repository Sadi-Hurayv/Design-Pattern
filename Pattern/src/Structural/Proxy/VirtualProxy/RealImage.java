/**
 * 
 */
package Structural.Proxy.VirtualProxy;

/**
 * @author shuvra
 *
 */
public class RealImage implements Image {

	private String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
		System.out.println("Loading " + fileName);
	}
	
	@Override
	public void displayImage() {
		System.out.println("Displaying " + fileName);
	}

}
