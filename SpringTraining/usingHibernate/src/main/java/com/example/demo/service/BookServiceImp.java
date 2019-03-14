package com.example.demo.service;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Book;

@Repository
public class BookServiceImp implements BookService {

	@Autowired
	private EntityManagerFactory factory;  
	@Override
	public List<Book> getBooks() {

		Session session =factory.unwrap(SessionFactory.class).openSession();
	 	CriteriaBuilder builder = session.getCriteriaBuilder();
	 	CriteriaQuery<Book> qry = builder.createQuery(Book.class);
	    Root<Book> root =	qry.from(Book.class);
		return session.createQuery(qry).getResultList();
	}
	
	@Override
	public Long AddBook(Book bk) {

		Session session =factory.unwrap(SessionFactory.class).openSession();
	    Long key =	(Long)session.save(bk);
	    session.beginTransaction().commit();
	    return key;
	}

}
