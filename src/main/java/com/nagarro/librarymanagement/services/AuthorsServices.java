package com.nagarro.librarymanagement.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagarro.librarymanagement.entity.Authors;
import com.nagarro.librarymanagement.repository.AuthorsRepository;
import com.nagarro.librarymanagement.servicesinterface.IAuthorsServices;

/**
 * AuthorsServices: CRUD operations on authors data
 * 
 *
 */
@Service
public class AuthorsServices implements IAuthorsServices{

	@Autowired
	AuthorsRepository authorsrepo;
	
	public void addAuthors(Authors author) 
	{
		authorsrepo.save(author);
		
	}
	
	public void updateAuthors(Authors author) 
	{
		authorsrepo.save(author);
		
	}
	
	public List<Authors> getAuthors()
	{
		return authorsrepo.findAll();
	}
	
	public Optional<Authors> getAuthor(int authorId)
	{
		return authorsrepo.findById(Integer.toString(authorId));

	}
	
	public void deleteAuthor(int authorId)
	{
		Authors author=authorsrepo.getById(Integer.toString(authorId));
		authorsrepo.delete(author);
		
	}
}
