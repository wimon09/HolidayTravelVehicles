import java.util.*;

public class Salesperson {
	private String salespersonID;
	private String name;
	private String contactInfo;

	private ArrayList<Invoice> invoices = new ArrayList<>();;

	public Salesperson(String salespersonID, String name, String contactInfo) {
		this.salespersonID = salespersonID;
		this.name = name;
		this.contactInfo = contactInfo;
	}

	public String getSalespersonID() {
		return salespersonID;
	}

	public String getName() {
		return name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}
}
