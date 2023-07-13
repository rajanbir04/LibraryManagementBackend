package com.nagarro.librarymanagement.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.librarymanagement.entity.Books;
import com.nagarro.librarymanagement.repository.BooksRepository;
import com.nagarro.librarymanagement.servicesinterface.IBooksServices;

/**
 * BooksServices: CRUD operations on books data
 * 
 *
 */
@Service
public class BooksServices implements IBooksServices{
	@Autowired
	BooksRepository booksrepo;
	
	
	public void addBook(Books book) 
	
	{
		Optional<Books> bookAvailable=booksrepo.findById(book.getBookCode());
		if(bookAvailable.isEmpty())
		{
			booksrepo.save(book);
		}
		
	}
	
	public void updateBook(Books book) 
	{
		booksrepo.save(book);
		
	}
	
	public List<Books> getBooks(){
		
		return booksrepo.findAll();
	}
	
	public Optional<Books> getBook(int bookCode)
	{
		return booksrepo.findById(bookCode);

	}
	
	public void deleteBook(int bookCode)
	{
		Books book=booksrepo.getById(bookCode);
		booksrepo.delete(book);
		
	}
}

