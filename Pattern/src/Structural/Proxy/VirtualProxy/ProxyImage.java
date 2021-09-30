/**
 * 
 */
package Structural.Proxy.VirtualProxy;

/**
 * @author shuvra
 *
 */
public class ProxyImage implements Image {
	
	private String fileNmae;
	private RealImage realImage;
	public ProxyImage(String fileName) {
		this.fileNmae = fileName;
	}

	@Override
	public void displayImage() {
		if(realImage == null) {
			realImage = new RealImage(fileNmae);
		}
		realImage.displayImage();
	}

}
