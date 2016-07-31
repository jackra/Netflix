package com.egen.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egen.api.entity.Comment;
import com.egen.api.entity.Movie;
import com.egen.api.exception.MovieAlreadyExistException;
import com.egen.api.exception.MovieNotFound;
import com.egen.api.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repository;

	@Override
	public List<Movie> findAll() {
		return repository.findAll();
	}

	@Override
	public Movie findOne(String id) {
		Movie existing = repository.findOne(id);
		if (existing == null) {
			throw new MovieNotFound("Movie with id=" + id + " not found");
		}
		return existing;
	}

	@Override
	public Movie create(Movie movie) {
		return repository.create(movie);
	}

	@Override
	public Movie update(String id, Movie movie) {
		Movie existing = repository.findOne(id);
		if (existing == null) {
			throw new MovieNotFound("Movie with id=" + id + " not found");
		}
		return repository.update(movie);
	}

	@Override
	public void delete(String id) {
		Movie existing = repository.findOne(id);
		if (existing == null) {
			throw new MovieNotFound("Movie with id=" + id + " not found");
		}
		repository.delete(existing);
	}

	@Override
	public void createComment(Comment cmt) {
		 repository.createComment(cmt);
	}

	@Override
	public List<Comment> findAll(String id) {
		return repository.findAll(id);
	}
}
