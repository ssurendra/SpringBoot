package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

interface BookService{
	public List<Book> getBooks();
	public Long AddBook(Book bk); 
}

