package com.alican;

import org.springframework.stereotype.Component;

@Component("SalesBean")
public class Sales {

	private int id;
	private String name;
	private int count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printSales() {
		System.out.println(" There isnt any sales ");
	}
}
