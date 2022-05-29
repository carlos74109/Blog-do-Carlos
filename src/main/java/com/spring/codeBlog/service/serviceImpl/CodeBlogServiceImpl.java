package com.spring.codeBlog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeBlog.model.Post;
import com.spring.codeBlog.repository.CodeBlogRepository;
import com.spring.codeBlog.service.CodeBlogService;

@Service
public class CodeBlogServiceImpl implements CodeBlogService {

	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	@Override
	public List<Post> findAll() {
		return codeBlogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeBlogRepository.save(post);
	}

	@Override
	public Void delete(Long id) {
		codeBlogRepository.deleteById(id);
		return null ;
	}

	
}
