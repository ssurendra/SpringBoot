package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.repos.PaymentRepo;
import com.example.demo.utils.ClientView;
import com.fasterxml.jackson.annotation.JsonView;

import ch.qos.logback.core.net.server.Client;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class PaymentController {

	@Autowired
	private PaymentRepo repo;
	
	@Autowired
	@Qualifier("Raja")
	private Payment pay1;

	@Autowired
	@Qualifier("Raghul")
	private Payment pay2;
	
	@GetMapping("/showPayment")
	public Payment getPayment() {
		return pay1;
	}
	
	@GetMapping("/findById/{id}")
	public Payment getPaymentById(@PathVariable long id) {
		
		if(id == 1) {
		return pay1;
		}
		else
			return pay2;
	}
	
	@GetMapping("/showAll")
	@JsonView(ClientView.class)
	public List<Payment> findAll() {
		return repo.findAll();
	}
	
	@PostMapping("/addPayment")
	@ApiOperation(value="This method saves payment detail")
	public Payment addPayment(@ApiParam(value="Input Payment") @RequestBody Payment pay1) {
		return repo.save(pay1);
	}
}
