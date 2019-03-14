package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class Author {

	private long authorId;
	private String authorName;
	public Author() {
		log.info("Author is called ");

		// TODO Auto-generated constructor stub
	}
}
