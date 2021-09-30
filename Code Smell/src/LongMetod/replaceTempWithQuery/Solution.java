package LongMetod.replaceTempWithQuery;

public class Solution {
	
	int quantity;
	int itemPrice;
	
	Solution()
	{
		
	}
	

	public double calculateTotal() {
		if (basePrice() > 1000) {
			return basePrice() * 0.95;
			}
		else {
		 return basePrice() * 0.98;
		 }
	 }
	
	private double basePrice()
	{
		return quantity * itemPrice;
	}

}
