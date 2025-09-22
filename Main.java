import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer customer = new customer("C001", "Alice Johnson", "123 Main St", "555-1234");


		Salesperson salesperson = new Salesperson("S001", "Bob Smith", "bob@holidaytravel.com");


		Vehicle vehicle = new Vehicle("V001", "Holiday RX-7", "Model X", 2025, "Holiday Motors", 50000);


		Invoice invoice = new Invoice("INV001", new Date(), "Alice Johnson", 0, // trade-in allowance
				50000, // final price
				3000, // tax
				200, // license fee
				customer, salesperson, vehicle);

		// Show invoice details
		System.out.println("===== Vehicle Invoice =====");
		System.out.println("Customer: " + invoice.getCustomer().getName());
		System.out.println("Salesperson: " + invoice.getSalesperson().getName());
		System.out.println("Vehicle: " + vehicle.getName() + " (" + vehicle.getModel() + ")");
		System.out.println("Final Price: $" + invoice.getFinalPrice());
		System.out.println("Tax: $" + invoice.getTax());
		System.out.println("License Fee: $" + invoice.getLicenseFee());
		System.out.println("Signature: " + invoice.getSignature());
	}
}
