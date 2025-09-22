import java.util.*;

public class Invoice {
	private String invoiceID;
	private Date date;
	private String signature;
	private double tradeInAllowance;
	private double finalPrice;
	private double tax;
	private double licenseFee;

	private customer customer; // One customer per invoice
	private Salesperson salesperson; // One salesperson per invoice
	private Vehicle vehicle; // One vehicle per invoice
	private TradeInVehicle tradeInVehicle; // Optional trade-in vehicle
	

	public Invoice(String invoiceID, Date date, String signature, double tradeInAllowance, double finalPrice,
			double tax, double licenseFee, customer customer, Salesperson salesperson, Vehicle vehicle) {
		this.invoiceID = invoiceID;
		this.date = date;
		this.signature = signature;
		this.tradeInAllowance = tradeInAllowance;
		this.finalPrice = finalPrice;
		this.tax = tax;
		this.licenseFee = licenseFee;
		this.customer = customer;
		this.salesperson = salesperson;
		this.vehicle = vehicle;

		// maintain bidirectional links
		customer.addInvoice(this);
		salesperson.addInvoice(this);
		vehicle.setInvoice(this);
	}

	// Getters and setters
	public String getInvoiceID() {
		return invoiceID;
	}

	public Date getDate() {
		return date;
	}

	public String getSignature() {
		return signature;
	}

	public double getTradeInAllowance() {
		return tradeInAllowance;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public double getTax() {
		return tax;
	}

	public double getLicenseFee() {
		return licenseFee;
	}

	public customer getCustomer() {
		return customer;
	}

	public Salesperson getSalesperson() {
		return salesperson;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public TradeInVehicle getTradeInVehicle() {
		return tradeInVehicle;
	}

	public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
		this.tradeInVehicle = tradeInVehicle;
		tradeInVehicle.addInvoice(this);
	}

}
