package Creational.FactoryMethod.Example3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory = new ShapeFactory();
		Shape s1, s2, s3;
		s1=factory.createShape(ShapeType.CIRCLE);
		s1.draw();
		
		s2=factory.createShape(ShapeType.RECTANGLE);
		s2.draw();
		
		s3=factory.createShape(ShapeType.TRIANGLE);
		s3.draw();
	}

}
