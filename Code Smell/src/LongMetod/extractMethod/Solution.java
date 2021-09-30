package LongMetod.extractMethod;

public class Solution {
	
	Solution(){
		//constructor
	}
	
String name="Shuvra";
	
	void printOwing()
	{
		//long code.........
		//After the long code
		printBanner();
		
		//Details
		printDetails(getOutstanding()); //extracting the method
	}

	void printDetails(double Outstanding)//extracted method
	{
		System.out.println("name: "+name);
		System.out.println("amount: "+Outstanding);
	}
	
	
	
	
	///below 2 method would be more perfect in real project with more functionality
	//here i am just using for practice
	 double getOutstanding() {
		// TODO Auto-generated method stub
		 double value = 0;
		 
		return value;
	}

	void printBanner() {
		// TODO Auto-generated method stub
		
	}

}
