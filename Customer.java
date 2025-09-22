import java.util.*;

public class customer {
	public String customerID;
	public String name;
	public String address;
	public String phone;

	private ArrayList<Invoice> invoices  = new ArrayList<>();

	public customer(String customerID, String name, String address, String phone) {
		this.customerID = customerID;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public ArrayList<Invoice> getInvoices() {
		return invoices;
	}
	public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }
}
