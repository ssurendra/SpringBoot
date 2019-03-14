package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Payment {


	private long tripId;
	@Autowired
	private ParterDriver driver;
	@Value("405.09")
	private double amount;
	public Payment() {
		super();
		System.out.println("==== Payment Constuctor called =====");
		// TODO Auto-generated constructor stub
	}
	public Payment(long tripId, ParterDriver driver, double amount) {
		super();
		this.tripId = tripId;
		this.driver = driver;
		this.amount = amount;
	}
	
	
	public long getTripId() {
	
		return tripId;
	}
	
	@Value("1000")
	public void setTripId(long tripId) {
		System.out.println("==== Set Trip id called =====");
		this.tripId = tripId;
	}
	public ParterDriver getDriver() {
		return driver;
	}
	public void setDriverName(ParterDriver driver) {
		this.driver = driver;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Payment [tripId=" + tripId + ", driver=" + driver + ", amount=" + amount + "]";
	}
	
	
}
