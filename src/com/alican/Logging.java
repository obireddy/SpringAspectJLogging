package com.alican;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("LoggingBean")
public class Logging {

	// Logging when printCustomer() method is calling
	@Pointcut("execution(* com.alican.Customer.printCustomer())")
	public void cutPrintCustomer() {

	}

	@Before("cutPrintCustomer()")
	public void beforeAdvice() {
		System.out.println("*** Logging BEFORE method execution  ***");
	}

	@After("cutPrintCustomer()")
	public void afterAdvice() {
		System.out.println("*** Logging AFTER method execution ***");
	}

	@AfterReturning(pointcut = "cutPrintCustomer()", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("*** Returning Value : " + retVal.toString()
				+ " ***");
	}

}
