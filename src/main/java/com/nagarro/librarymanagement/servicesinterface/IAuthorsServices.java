package com.nagarro.librarymanagement.servicesinterface;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.nagarro.librarymanagement.entity.Authors;

/**
 * It is interface that contains all functions to provide CRUD operations on authors data
 * 
 *
 */
@Service
public interface IAuthorsServices {

	public void addAuthors(Authors author);
	
	public void updateAuthors(Authors author);
	
	public List<Authors> getAuthors();
	
	public Optional<Authors> getAuthor(int authorId);
	
	public void deleteAuthor(int authorId);

}
