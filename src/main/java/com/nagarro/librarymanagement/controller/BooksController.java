package com.nagarro.librarymanagement.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.librarymanagement.entity.Books;
import com.nagarro.librarymanagement.services.BooksServices;
import com.nagarro.librarymanagement.servicesinterface.IBooksServices;

/**
 * BooksController: To provide CRUD operations on books data
 * 
 *
 */
@RestController
public class BooksController
{
	@Autowired
	IBooksServices bookservice;
	
	/**
	 * To add book in the database
	 *
	 */
	@PostMapping(path="/books",consumes= {"application/json"})
	public void addBook(@RequestBody Books book) 
	
	{
		bookservice.addBook(book);
		
	}
	
	/**
	 * To update book in the database
	 *
	 */	
	@PutMapping(path="/books",consumes= {"application/json"})
	public void updateBook(@RequestBody Books book) 
	{
		bookservice.updateBook(book);	
	}
	
	/**
	 * To get all books from the database
	 *
	 */
	@GetMapping(path="/books")
	public List<Books> getBooks()
	{
		List<Books> bookList = bookservice.getBooks();
		return bookList;
	}
	
	/**
	 * To get book on the basis of book code from the database
	 *
	 */
	@RequestMapping("/books/{bookCode}")
	public Optional<Books> getBook(@PathVariable("bookCode") int bookCode)
	{
		return bookservice.getBook(bookCode);
	}
	
	/**
	 * To delete book on the basis of book code from the database
	 *
	 */
	@DeleteMapping("/books/{bookCode}")
	public void deleteBook(@PathVariable("bookCode") int bookCode)
	{
		bookservice.deleteBook(bookCode);
		
	}
}

