package Behavioral.ChainOfResponsiblity;

public class Main {
	public static void main(String[] args) {
		Chain c1 = new OneDimension();
		Chain c2 = new TwoDimension();
		Chain c3 = new ThreeDimension();
		
		c1.setNext(c2);
		c2.setNext(c3);
		
		c1.process(new Dimension(1));
		c1.process(new Dimension(1,2));
		c1.process(new Dimension(1,2,3));
	}
}
