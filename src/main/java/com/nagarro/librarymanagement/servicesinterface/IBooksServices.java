package com.nagarro.librarymanagement.servicesinterface;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.nagarro.librarymanagement.entity.Books;

/**
 * It is interface that contains all functions to provide CRUD operations on data data
 * 
 *
 */
@Service
public interface IBooksServices 
{
	public void addBook(Books book);
	
	public void updateBook(Books book);
	
	public List<Books> getBooks();
	public Optional<Books> getBook(int bookCode);
	
	public void deleteBook(int bookCode);
}

