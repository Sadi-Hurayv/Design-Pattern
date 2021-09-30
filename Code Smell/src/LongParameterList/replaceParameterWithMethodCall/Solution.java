package LongParameterList.replaceParameterWithMethodCall;

public class Solution {

	int quantity;
	int itemPrice;
	
	public Solution(int quantity, int itemPrice) {
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	
	double getPrice() {
		double basePrice = quantity * itemPrice;
		double finalPrice = discountedPrice(basePrice);
		return finalPrice;
	}

	int getDiscountLevel() {
		if(quantity > 100) {
			return 2;
		}
		else {
			return 1;
		}
	}
	

	private double discountedPrice(double basePrice) {
		// TODO Auto-generated method stub
		if(getDiscountLevel()==2) {
			return basePrice * 0.1;
		}
		else {
			return basePrice * 0.05;
		}
	}
	
}