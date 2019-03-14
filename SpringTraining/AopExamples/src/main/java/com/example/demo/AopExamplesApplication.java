package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.advices.CalculateTime;
import com.example.demo.advices.FestivalOffer;
import com.example.demo.domains.Billing;
import com.example.demo.ifaces.DiscountService;

@SpringBootApplication
public class AopExamplesApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx = 	SpringApplication.run(AopExamplesApplication.class, args);
	 DiscountService svc =  ctx.getBean(DiscountService.class);
	 System.out.println(svc.cashDiscount());
	}

	@Bean
	public DiscountService sevice()
	{
		return new Billing();
	}
	
	@Bean
	public FestivalOffer offer()
	{
		return new FestivalOffer();
		
	}
	
	@Bean 
	public CalculateTime caluate()
	{
		return new CalculateTime();
	}
}