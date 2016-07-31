package com.egen.api.service;

import java.util.List;

import com.egen.api.entity.Comment;
import com.egen.api.entity.Movie;

public interface MovieService {

	public List<Movie> findAll();

	public List<Comment> findAll(String id); 
	public Movie findOne(String id);

	public Movie create(Movie user);

	public Movie update(String id, Movie user);

	public void delete(String id);
	
	public void createComment(Comment cmt);
}
