package LongParameterList.replaceParameterWithMethodCall;

public class Problem {
	
	int quantity;
	int itemPrice;

	public Problem(int quantity, int itemPrice) {
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	
	public double getPrice() {
		
		double basePrice = quantity * itemPrice;
		int discountLevel;
		
		if(quantity > 100) {
			discountLevel = 2;
		}
		else {
			discountLevel = 1;
		}
		
		double finalPrice = discountedPrice(basePrice,discountLevel);
		
		return finalPrice;
	}

	private double discountedPrice(double basePrice, int discountLevel) {
		// TODO Auto-generated method stub
		if(discountLevel==2) {
			return basePrice * 0.1;
		}
		else {
			return basePrice * 0.05;
		}
	}

	

}
