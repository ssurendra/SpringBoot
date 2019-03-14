package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Book;
import com.example.demo.service.BookServiceImp;

@SpringBootApplication
public class UsingHibernateApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx =	SpringApplication.run(UsingHibernateApplication.class, args);
	 BookServiceImp bks = ctx.getBean(BookServiceImp.class);
	 //Book bk = ctx.getBean(Book.class);
	 
	 //Long pk = bks.AddBook(bk);
	 System.out.println(bks.getBooks().toString());
	}

	@Bean
	public Book book() {
		return new Book(23,"Spring",400);
	}
}
