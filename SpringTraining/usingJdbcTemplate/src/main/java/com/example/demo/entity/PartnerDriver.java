package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Getter
@Setter 
@Slf4j
@Data
@AllArgsConstructor
public class PartnerDriver {


	public PartnerDriver() {
		super();
		// TODO Auto-generated constructor stub
	}
	private long driverId;
	private String driverName;
	private long mobileNumber;
	public double rateing;
}
