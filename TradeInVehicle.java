import java.util.ArrayList;

public class TradeInVehicle {
	private String serialNumber;
	private String make;
	private String model;
	private int year;
	private ArrayList<Invoice> invoices  = new ArrayList<>();

	public TradeInVehicle(String serialNumber, String make, String model, int year) {
		this.serialNumber = serialNumber;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Getters and setters
	public String getSerialNumber() {
		return serialNumber;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public ArrayList<Invoice> getInvoices() {
		return invoices;
	}

	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}
}
