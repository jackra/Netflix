package com.egen.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.egen.api.entity.Comment;
import com.egen.api.entity.Movie;



@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Movie> findAll() {
		TypedQuery<Movie> query = em.createQuery("from Movie", Movie.class);
		return query.getResultList();
	}

	@Override
	public Movie findOne(String id) {
		return em.find(Movie.class, id);
	}

	@Override
	public Movie create(Movie movie) {
		em.persist(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie) {
		return em.merge(movie);
	}

	@Override
	public void delete(Movie movie) {
		em.remove(movie);
	}

	@Override
	public void createComment(Comment cmt) {
		em.persist(cmt);
	}

	@Override
	public List<Comment> findAll(String id) {
		TypedQuery<Comment> query = em.createNamedQuery("comment.findById", Comment.class);
		query.setParameter("pType", id);
		List<Comment> cmts = query.getResultList();
		return cmts;
	}

}
