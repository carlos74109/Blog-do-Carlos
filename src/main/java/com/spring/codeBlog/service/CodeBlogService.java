package com.spring.codeBlog.service;

import java.util.List;

import com.spring.codeBlog.model.Post;

public interface CodeBlogService {
	
	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);
	Void delete(Long id);
	
}
