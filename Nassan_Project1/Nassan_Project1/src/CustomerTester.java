/**
 * Program Name: CustomerTester.java
 * Purpose: Tester class to test the classes
 *Coder: Adnan Nassan for Section 01
 * Date: Jun 25, 2024
 */

public class CustomerTester
{

	public static void main(String[] args)
	{
		//Print title
		 System.out.println("\nWelcome to the Customer tester!\n");
     System.out.println("---------------------------------------------------------------------------------------\n");
     System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods\n");
     System.out.println("---------------------------------------------------------------------------------------\n");
     
		//declare a customerArray of size three
		Customer [] customerArray = new Customer[3];
		
		//Create three  object of type customer
		Customer customer1 = new BusinessCustomer("Mike", "Holmes", "Business Customer", " Home Depot", 10, 3105.50);
		Customer customer2 = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200.00);
		Customer customer3 = new PreferredCustomer("Wei", "Ping", " Preferred Customer", 6456.85, 5);
		
		//initialize the objects to the customerArray
		customerArray[0] = customer1;
		customerArray[1] = customer2;
		customerArray[2] = customer3;
		
		// Print array element
		for (int i = 0; i < customerArray.length; i ++)
			System.out.println(customerArray[i].toString() + "\n");
		
		//print the frist name and last name and the incentives of each customer associated with objects of the array element's
		for (int i = 0; i <  customerArray.length; i ++) {
			System.out.print(customerArray[i].getFirstName() +" "+ customerArray[i].getLastName() + "earns a discount incentive of $");
			System.out.printf("%.2f\n\n", customerArray[i].incentives());
		}
		
		// Create three object of type BusinessCustomer, another of type RetailCustomer, and one of type PreferredCustomer
		BusinessCustomer customer4 = new BusinessCustomer("Tristan", "Lee", "Business Customer", "Starbucks", 15, 9875.25);
		RetailCustomer customer5 = new RetailCustomer("Carlos", "Beltran", "Retail Customer", 3100.50);
		PreferredCustomer customer6 = new PreferredCustomer("Arti", "Patel", "Preferred Customer", 10450.00, 10);
		
		//clla the method toString to print the objects informations
		System.out.println( "\n\n"+customer4.toString() + "\n");
		System.out.println(customer5.toString() + "\n");
		System.out.println(customer6.toString() + "\n");
		
		//calling some getters methods to set some data
		customer4.setTotalPurchases(8895.00);
		customer4.setDiscountRate(12);
		customer5.setTotalPurchases(100500.00);
		customer6.setTotalPurchases(14987.24);
		customer6.setLastName("Patel-ruhil");
		customer6.setCashbackRate(13);
		
		// call the toString for each object to print the customer information
		System.out.println(customer4.toString() + "\n");
		System.out.println(customer5.toString() + "\n");
		System.out.println(customer6.toString() + "\n");
		
		
		

	}
	//end main
}
//end class