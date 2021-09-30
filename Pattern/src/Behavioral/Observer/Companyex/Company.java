package Behavioral.Observer.Companyex;

import java.util.ArrayList;

public class Company {
	
	private String name;
	private Share share;
	private ArrayList<User>userList=new ArrayList<User>();
	private double previousSharePrice, currentSharePrice;
	
	public Company(String name, Share share) {
		this.name=name;
		this.share=share;
		
		//Initial share price
		this.previousSharePrice=share.getSharePrice();
		this.currentSharePrice=share.getSharePrice();
	}
	
	public String getName() {
		return name;
	}
	
	public double getCurrentSharePrice() {
		return currentSharePrice;
	}
	
	
	public void registerUser(User user) {
		userList.add(user);
	}
	
	public void unreginsterUser(User user) {
		userList.remove(user);
	}
	
	
	public void notifyUser() {
		this.currentSharePrice=share.getSharePrice();
		if(currentSharePrice!=previousSharePrice) {
			for (User user : userList) {
				user.reciveNotification(this);
			}
			System.out.println();
			previousSharePrice=currentSharePrice;
		}
	}

}
