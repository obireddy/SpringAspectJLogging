package com.alican;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CustomerBean")
public class Customer {

	private String firstname;
	private String lastname;
	private String address;

	@Autowired
	private Sales sales;

	@PostConstruct
	public void init() {
		System.out
				.println("********** PostConstructor Method is running **********");
	}

	// print sales from Sales Class
	public Sales getSales() {
		sales.printSales();
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String printCustomer() {
		System.out.println(" There are some customer info...");
		return "Alican";
	}
}
