package com.cg.bsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.bsm.entity.Book;
import com.cg.bsm.exception.BookStoreException;
import com.cg.bsm.util.JPAUtil;



public  class BookDAOJPAImpl implements IBookDAO {
	
	EntityManager em;
	
	public BookDAOJPAImpl(){
		
		em = JPAUtil.getEntityManager();
	}
	
	public String add_book(Book book) throws BookStoreException {
		
		//String serialNumber = null;
		try {
			
			if (book != null) {
				
				EntityTransaction insert = em.getTransaction();
				insert.begin();
				em.persist(book);
				insert.commit();
				
			}
			
		} catch(Exception e) {
			
			throw new BookStoreException("Book was not inserted");
			
		}
		
		return book.getBcode();
		
	}
	
	
	public boolean remove_book(String serialNumber) throws BookStoreException {
		
		boolean isDone = false;
		
		try {
			
			EntityTransaction delete = em.getTransaction();
			Book b = em.find(Book.class, serialNumber);
			
			if(b != null) {
				
				delete.begin();
				em.remove(b);
				delete.commit();
				isDone = true;
				
			}
			
		} catch (Exception e) {
			
			throw new BookStoreException("Book not found");
			
		}

		return isDone;
		
	}
	
	
	public Book search_book(String serialNumber) throws BookStoreException {
		
		Book b = null;
		
		try {
			
			b = em.find(Book.class, serialNumber);
			
		} catch (Exception e) {
			
			throw new BookStoreException("Book not found");
			
		}
		
		return b;
		
	}
	
	
	public List <Book> list_books() throws BookStoreException {
		
		List <Book> books;
		
		try {
			
			String selectAll = "SELECT b FROM Book b";
			
			TypedQuery <Book> tq = em.createQuery(selectAll,Book.class);
			books = tq.getResultList();
			
		} catch(Exception e) {
			
			throw new BookStoreException("No books");
			
		}
		
		return books;
		
		
	}
	
	
	public boolean update_book(Book book) throws BookStoreException {
		
		boolean isDone = false;
		if (book != null) {
			try {
				
				EntityTransaction update = em.getTransaction();
				update.begin();
				em.merge(book);
				update.commit();
				isDone = true;
				
				
			} catch (Exception e) {
				
				throw new BookStoreException("Book is not updated.");
			}
		}
		
		return isDone;
	}
	
	
	public void persist() throws BookStoreException {
		
	}

}
