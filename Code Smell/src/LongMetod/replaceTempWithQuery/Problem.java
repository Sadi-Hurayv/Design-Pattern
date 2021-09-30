package LongMetod.replaceTempWithQuery;

public class Problem {

	int quantity;
	int itemPrice;
	

	double calculateTotal() {
		double basePrice = quantity * itemPrice;  //Replace Temp With Query
		if (basePrice > 1000) {
			return basePrice * 0.95;
			}
		else {
		 return basePrice * 0.98;
		 }
	 }
	
}
