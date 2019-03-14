package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.Library;

@Configuration
public class ApplicationConfig {

	@Bean
	@Lazy(value = true)
	public Author author() {
		return new Author(101,"Ramesh");
		//return new Author();
	}
	
	@Bean(initMethod="init")	
	public Book book() {
		//return new Book(101,"Sprint in Action",author());
		return new Book();
		
	}
	
	@Bean(initMethod="init")	
	public Book springbook() {
		//return new Book(301,"spring",author());
		return new Book();
		
	}
	@Bean(initMethod="init")	
	public Book javabook() {
		//return new Book(401,"java",author());
		return new Book();
		
	}
	@Bean(initMethod="init")	
	public Book dotnetbook() {
		//return new Book(101,"DotNet",author());
		return new Book();
		
	}
	
	@Bean
	public Library library(){
		Library gandhilb = new Library();
		gandhilb.setLibaryName("gandhilb");
		return gandhilb;
	}
}
