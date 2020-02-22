package com.example.myDemoAppNew.rest.services;

import com.example.myDemoAppNew.rest.entity.Author;
import com.example.myDemoAppNew.rest.repository.AuthorRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService extends AuthorRepository {

    public Author findByAuthorId(Integer id);

    @Query(value = "select max(author_id) from author", nativeQuery = true)
    public Integer findFirstAuthorIdOrderByAuthorIdDesc();

}
