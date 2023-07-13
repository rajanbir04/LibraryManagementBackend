package com.nagarro.librarymanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.librarymanagement.entity.Authors;


@Repository
public interface AuthorsRepository extends JpaRepository<Authors, String> {

}
