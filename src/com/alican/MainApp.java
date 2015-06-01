package com.alican;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		Customer customer = (Customer) context.getBean("CustomerBean");

		customer.getSales();
		customer.printCustomer();
	}

}
