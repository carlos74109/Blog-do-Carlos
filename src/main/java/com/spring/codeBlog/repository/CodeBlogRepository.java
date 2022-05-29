package com.spring.codeBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codeBlog.model.Post;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {

}
