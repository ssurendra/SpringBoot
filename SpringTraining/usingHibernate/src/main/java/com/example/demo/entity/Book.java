package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookCode;
	private String bookName;
	private double price;
	

}
