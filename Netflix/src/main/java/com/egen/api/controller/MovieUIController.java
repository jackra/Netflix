package com.egen.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.egen.api.entity.Comment;
import com.egen.api.entity.Movie;
import com.egen.api.entity.User;
import com.egen.api.service.MovieService;
import com.egen.api.service.UserService;


@Controller
@RequestMapping("/moviess")
public class MovieUIController {

	@Autowired
	private MovieService service;

	@RequestMapping(method = RequestMethod.GET)
	public String findAll(ModelMap map) {
		List<Movie> movies =  service.findAll();
		map.addAttribute("movies", movies);
		return "movie";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public String findOne(@PathVariable("id") String movieId,ModelMap map ) {
		System.out.println("testseting@@@@@@@@@@@@@@@@@@");
		Movie movie= service.findOne(movieId);
		 List<Comment> comments= service.findAll(movieId);
		 map.addAttribute("cmts", comments);
		map.addAttribute("movie", movie);
		return "info";
	}

	@RequestMapping(method = RequestMethod.POST)
	public Movie create(@RequestBody Movie movie) {
		return service.create(movie);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/create")
	public String createComment(@ModelAttribute Comment cmt, ModelMap map,@RequestParam("movieid") String id)
	{
		Movie movie= service.findOne(id);
		cmt.setMovie(movie);
		 service.createComment(cmt);
		 List<Comment> comments= service.findAll(id);
		 map.addAttribute("cmts", comments);
		 map.addAttribute("movie", movie);
		 return "info";
	}
}
