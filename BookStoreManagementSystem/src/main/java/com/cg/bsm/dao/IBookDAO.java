package com.cg.bsm.dao;

import com.cg.bsm.entity.Book;
import com.cg.bsm.exception.BookStoreException;

import java.util.List;

public interface IBookDAO {	
	String add_book(Book book) throws BookStoreException;
	boolean remove_book(String bcode)throws BookStoreException;
	Book search_book(String bcode) throws BookStoreException;;
	List<Book> list_books() throws BookStoreException;;
	boolean update_book(Book book) throws BookStoreException;
	void persist()throws BookStoreException;
}


