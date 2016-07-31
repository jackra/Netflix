package com.egen.api.repository;

import java.util.List;

import com.egen.api.entity.Comment;
import com.egen.api.entity.Movie;

public interface MovieRepository {

	public List<Movie> findAll();

	public Movie findOne(String id);

	public Movie create(Movie movie);

	public Movie update(Movie movie);

	public void delete(Movie movie);
	
	public List<Comment> findAll(String id);
	
	public void createComment(Comment cmt);
}
