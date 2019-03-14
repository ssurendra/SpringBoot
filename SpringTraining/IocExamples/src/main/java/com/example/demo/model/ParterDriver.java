package com.example.demo.model;

import org.springframework.stereotype.Component;

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
@Component
public class ParterDriver {

	private long driverId;
	private String driverName;
	private long mobileNumber;
	public double rateing;
	public ParterDriver() {
		super();		
     log.info("default constuctor for parter driver");
		
	} 
	
}
