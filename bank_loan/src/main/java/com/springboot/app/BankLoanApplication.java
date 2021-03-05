package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankLoanApplication.class, args);
		System.out.println("=======================================================================");
        System.out.println("Hello, Welcome to Loan Application ");
        System.out.println("=======================================================================");
	}

}
