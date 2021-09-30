package LongMetod.replaceMethodWithMethodObject.solution;

public class Order {

	// ....

	public double price() {

		return new PriceCalculator(this).compute();
	}

}
