/**
 * 
 */
package Structural.Proxy.VirtualProxy;

import java.util.ArrayList;

/**
 * @author shuvra
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Image> images = new ArrayList<Image>();
		
		images.add(new ProxyImage("Photo_1"));
		images.add(new ProxyImage("Photo_2"));
		images.add(new ProxyImage("Photo_3"));
		
		//Loading is necessary
		images.get(0).displayImage();
		images.get(1).displayImage();
		images.get(2).displayImage();
		
		System.out.println();
		
		//Loading is not necessary
		images.get(0).displayImage();
		images.get(1).displayImage();
		images.get(2).displayImage();
		
		//Another Test
		
		ProxyImage p1 = new ProxyImage("Test_Photo_1");
		ProxyImage p2 = new ProxyImage("Test_Photo_2");
		ProxyImage p3 = new ProxyImage("Test_Photo_3");
		
		//Loading is necessary
		p1.displayImage();
		p2.displayImage();
		p3.displayImage();
		
		System.out.println();
		
		//Loading is not necessary
		p1.displayImage();
		p2.displayImage();
		p3.displayImage();
	}

}
