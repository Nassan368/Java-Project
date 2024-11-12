/**
 * Program Name: PreferrefCustomer.java
 * Purpose: subclass from the superclass RetailCustomer
 *Coder: Adnan Nassan for Section 01
 * Date: Jun 25, 2024
 */

public class PreferredCustomer extends RetailCustomer
{
//declare private members
	private int cashbackRate;
	
	//define constructors
	public PreferredCustomer() {}
	
	public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate) {
		
		super(firstName, lastName, customerLevel, totalPurchases);
		this.cashbackRate = cashbackRate;
	}
	
	//deifne stters and getters
	public int getCashbackRate () {
		return cashbackRate;
	}
	
	public void setCashbackRate(int cashbackRate) {
		this.cashbackRate = cashbackRate;
	}
	
	//override the toString method and the abstract method'Incectives from the supclass
	@Override
	public double incentives() {
		return (((this.cashbackRate / 100.0) * super.incentives()) + (double)(super.incentives()));
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Cashback Rate: %d%% \n\n", cashbackRate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//end class