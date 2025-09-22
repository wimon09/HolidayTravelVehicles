import java.util.*;

public class Vehicle {

	private String serialNumber;
	private String name;
	private String model;
	private int year;
	private String manufacturer;
	private double baseCost;
	private Invoice invoice;

	public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.baseCost = baseCost;
	}

	// Getters and setters
	public String getSerialNumber() {
		return serialNumber;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
