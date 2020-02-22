package com.example.myDemoAppNew.rest.repository;

import com.example.myDemoAppNew.rest.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
