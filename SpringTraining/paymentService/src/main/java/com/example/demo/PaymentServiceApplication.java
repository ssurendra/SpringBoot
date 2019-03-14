package com.example.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Payment;
import com.example.demo.repos.PaymentRepo;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
@EnableSwagger2
@EnableDiscoveryClient
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}
	
	@Bean(name="Raghul")
	public Payment payment() {
		return new Payment(303, LocalDate.of(2018, Month.AUGUST,03), 3000, "Raghul");
				
	}
	
	@Bean(name="Raja")
	public Payment secondpayment() {
		return new Payment(363, LocalDate.of(2018, Month.AUGUST,03), 6000, "Raja");
				
	}
	
	
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).
				select().apis(RequestHandlerSelectors.any()).build();
	}
	
	
	public CommandLineRunner commanlineRunner(PaymentRepo repo) {
	
		return args->{
			repo.save(new Payment(201,LocalDate.of(2018, Month.APRIL, 12) ,4500,"suresh"));

			repo.save(new Payment(201,LocalDate.of(2018, Month.FEBRUARY, 10) ,4000,"Raja"));

			repo.save(new Payment(201,LocalDate.of(2018, Month.JULY, 02) ,500,"Ravi"));

			repo.save(new Payment(201,LocalDate.of(2018, Month.JANUARY, 22) ,1000,"sureshkumar"));
		};
		
	}

}
