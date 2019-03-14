package com.example.demo.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import com.example.demo.model.Author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class Book {

	private long bookNumber;
	private String bookName;
	private Author author; 
	@Autowired
	private Environment env;
	
	public void init()
	{
		String[] profiles = env.getActiveProfiles();
	}
	public Book() {
	
		log.info("Book Constructor called");
		String[] profiles = env.getActiveProfiles();
		for(String profile :profiles)
		{
			System.out.println(profile);			
		}
	}

}
