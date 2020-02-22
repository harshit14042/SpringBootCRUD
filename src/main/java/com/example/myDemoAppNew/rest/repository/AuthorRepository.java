package com.example.myDemoAppNew.rest.repository;

import com.example.myDemoAppNew.rest.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
