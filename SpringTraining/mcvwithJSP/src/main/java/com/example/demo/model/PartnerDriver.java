package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="partnerdriver")
public class PartnerDriver {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long driverId;
	private String driverName;
	private long mobileNumber;
	public double rateing;
	
}
