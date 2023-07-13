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
import com.nagarro.librarymanagement.entity.Authors;
import com.nagarro.librarymanagement.services.AuthorsServices;
import com.nagarro.librarymanagement.servicesinterface.IAuthorsServices;

/**
 * AuthorsController: To provide CRUD operations on authors data
 * 
 *
 */
@RestController
public class AuthorsController {

	@Autowired
	IAuthorsServices authorservice;
	
	/**
	 * To add author in the database
	 *
	 */
	@PostMapping(path="/authors",consumes= {"application/json"})
	public void addAuthors(@RequestBody Authors author) 
	{
		authorservice.addAuthors(author);
		
	}
	
	/**
	 * To update author in the database
	 *
	 */	
	@PutMapping(path="/authors",consumes= {"application/json"})
	public void updateAuthors(@RequestBody Authors author) 
	{
		authorservice.updateAuthors(author);
		
	}
	
	/**
	 * To get all authors from the database
	 *
	 */
	@GetMapping(path="/authors")
	public List<Authors> getAuthors()
	{
		return authorservice.getAuthors();
	}
	
	/**
	 * To get author on the basis of author id from the database
	 *
	 */
	@RequestMapping("/authors/{authorId}")
	public Optional<Authors> getAuthor(@PathVariable("authorId") int authorId)
	{
		return authorservice.getAuthor(authorId);

	}
	
	/**
	 * To delete author on the basis of author id from the database
	 *
	 */
	@DeleteMapping("/authors/{authorId}")
	public void deleteAuthor(@PathVariable("authorId") int authorId)
	{
		authorservice.deleteAuthor(authorId);		
	}
}
