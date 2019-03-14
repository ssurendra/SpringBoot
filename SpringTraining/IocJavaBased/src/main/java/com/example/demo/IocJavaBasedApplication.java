package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.Library;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class IocJavaBasedApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(IocJavaBasedApplication.class, args);
		//Author ram = (Author)ctx.getBean("author");
		//Book  bk = (Book)ctx.getBean(Book.class);
		//log.info(ram.toString());
		//log.info(bk.toString());
	
		Library lib = ctx.getBean(Library.class);
		lib.getBooklist().forEach(System.out::println);
	}

}
