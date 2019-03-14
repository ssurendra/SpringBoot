package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@RestController
public class PaymentClient {

	@Autowired
	RestTemplate template;
	
	@Autowired
	private EurekaClient client;
	
	@GetMapping("/showSinglePayment")
	public String getPaymentDetails()
	{
		return	template.getForObject("http://payment-details-service/showPayment", String.class);
	}
}
