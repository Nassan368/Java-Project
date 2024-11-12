/**
 * Program Name: RetailCustomer.java
 * Purpose: subclass from the superclass Customer
 *Coder: Adnan Nassan for Section 01
 * Date: Jun 25, 2024
 */

public class RetailCustomer extends Customer
{
	// declare private members
	private double totalPurchases;
	
//define constructors
	public RetailCustomer() {}
	
	public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases) {
		super(firstName, lastName, customerLevel);
		this.totalPurchases = totalPurchases;
	}
	
	//deifne stters and getters
	public double getTotalPurchases() {
		return totalPurchases;
	}
	
	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	
	//define method to fine the discount rate for the retail customer
	public int findDiscountRate() {
		int temp = 0;
		if (totalPurchases > 10000.0)
			temp =  15;
		else if (totalPurchases > 5000.0)
			temp =  10;
		else if (totalPurchases > 1000.0)
			temp =  5;
		return temp;
	}
	
//override the toString method and the abstract method'Incectives from the supclass Customer'
	@Override
	public double incentives() {
		return totalPurchases * (findDiscountRate() / 100.0);
	}
	
	@Override
	public String toString () {
		 return super.toString() + String.format("\n \nTotal Purchases: $%.2f\n\nDiscount Rate: %d%%\n\nDiscount Incentive: $%.2f\n\nNet Purchases: $%.2f \n\n",
         totalPurchases, findDiscountRate(), incentives(), totalPurchases - incentives());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//end class