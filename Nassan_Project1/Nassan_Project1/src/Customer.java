/**
 * Program Name: Customer.java
 * Purpose: this program is a superclass for the subclasses BusinessCustomer, PreferredCustomer, and RetailCustomer
 *Coder: Adnan Nassan for Section 01
 * Date: Jun 24, 2024
 */
import java.util.*;
public abstract class Customer
{
	//declare some private members
	private String firstName;
	private String lastName;
	private String customerId;
	private String customerLevel;
	
	//build constructers
	
	public Customer (){}
	
	public Customer (String firstName, String lastName, String customerLevel)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerLevel = customerLevel;
		setCustomerId();
	}
	
	//define setters and getters
	
	public String getFirstName ()
	{
		return firstName;
	}
	
	public String getLastName ()
	{
		return lastName;
	}	
	
	public String getCustomerId ()
	{
		return customerId;
	}	
	
	public String getCustomerLevel ()
	{
		return customerLevel;
	}	
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	private void setCustomerId() {
		 StringBuilder id = new StringBuilder(lastName.toUpperCase());
     while (id.length() < 4) {  //if the last name length less than 4 add the char x 
         id.append("X");
     }
     id.setLength(4); // Ensure the ID is exactly 4 characters long
     id.append('-');
     // create a random object to generate random numbers between 0-9 whith seed of 10
     Random rand = new Random();
     for (int i = 0; i < 5; i++) {
         id.append(rand.nextInt(10));
     }
     this.customerId = id.toString();
}
		

	
	
	public void setCustomerLevel(String customerLevel)
	{
		this.customerLevel = customerLevel;
	}
	
	//define an abstract method
	
	public abstract double incentives ();
	
	//define toString method
	public String toString () {
		
		//return (this.customerId+ ", " + this.firstName +  " " +this.lastName + "\n\n" + this.customerLevel);
		 return String.format("%s, %s %s \n\n%s", this.customerId, this.firstName, this.lastName, this.customerLevel);
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//end class