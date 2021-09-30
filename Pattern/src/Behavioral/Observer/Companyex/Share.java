package Behavioral.Observer.Companyex;

public class Share {
	
	private double sharePrice;
	
	public Share(double price) {
		this.sharePrice=price;
	}

	public void setSharePrice(double price) {
		this.sharePrice=price;
	}
	
	public double getSharePrice() {
		return this.sharePrice;
	}

}
