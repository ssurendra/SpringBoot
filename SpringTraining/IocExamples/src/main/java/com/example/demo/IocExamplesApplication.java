package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.ParterDriver;
import com.example.demo.model.Payment;

@SpringBootApplication
public class IocExamplesApplication {

	public static void main(String[] args) {
	
	 ConfigurableApplicationContext ctx= 	SpringApplication.run(IocExamplesApplication.class, args);
	 Payment payment = ctx.getBean(Payment.class);
	 
	 ParterDriver  driver =  payment.getDriver();
	 driver.setDriverId(2001);
	 driver.setDriverName("Ramesh");
	 
	 System.out.println(payment);
	 
	}

}
