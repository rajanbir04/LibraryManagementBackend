package com.nagarro.librarymanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.librarymanagement.entity.Books;


@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

}
