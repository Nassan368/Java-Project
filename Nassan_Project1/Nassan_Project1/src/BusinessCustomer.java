/**
 * Program Name: BusinessCustomer.java
 * Purpose: subclass from the superclass Customer
 *Coder: Adnan Nassan for Section 01
 * Date: Jun 24, 2024
 */

public class BusinessCustomer extends Customer
{
	
	// declare private members
	private String companyName;
	private int discountRate;
	private double totalPurchases;
	
	//define constructors
	public BusinessCustomer () {
		super();
	}
	
	public BusinessCustomer (String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases ) {
		
		super(firstName, lastName, customerLevel);
		this.companyName = companyName;
		this.discountRate = discountRate;
		this.totalPurchases = totalPurchases;
	}
	
	//define setters and getters
	public String getCompanyName() {
		return companyName;
	}
	
	public int getDiscountRate() {
		return discountRate;
	}
	
	public double getTotalPurchases() {
		return totalPurchases;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	
	//override the toString method and the abstract method'Incectives from the supclass Customer'
	
	@Override
	public double incentives() {
		return totalPurchases * (discountRate / 100.0);
	}
	
	@Override
	public String toString() {
		
		 return super.toString() + String.format(" for %s\n\nTotal Purchases: $%.2f\n\nDiscount Rate: %d%%\n\nDiscount Incentive: $%.2f\n\nNet Purchases: $%.2f \n\n",
         companyName, totalPurchases, discountRate, incentives(), totalPurchases - incentives());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//end class