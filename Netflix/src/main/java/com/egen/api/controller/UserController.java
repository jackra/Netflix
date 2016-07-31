package com.egen.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.egen.api.entity.Movie;
import com.egen.api.entity.User;
import com.egen.api.service.MovieService;
import com.egen.api.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	@Autowired
	private MovieService services;
	
	@RequestMapping(method = RequestMethod.GET, value="signup")
	public String findAll() {
		return "signup";
	}
	
	
	@RequestMapping(method = RequestMethod.POST,  value="/login")
	public String findOne(@ModelAttribute User user, ModelMap map) {
		User usr =null;
		System.out.println(user);
		if(user!=null){
		 usr= service.findByEmail(user.getEmail());
		}
		if(usr!=null){
		if(user.getPwd().equals(usr.getPwd()))
		{
			map.addAttribute("user",usr);
			List<Movie> movies =  services.findAll();
			map.addAttribute("movies", movies);
			return "movie";
		}}
		map.addAttribute("message","Incorrect Login");
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST, value="/createUser")
	public String create(@ModelAttribute User user, ModelMap map,@RequestParam("pwds") String pwds) {
		if((user.getPwd().equals(pwds))){
			
			 service.create(user);
				map.addAttribute("user",user);
				List<Movie> movies =  services.findAll();
				map.addAttribute("movies", movies);
				return "movie";	
		}
		map.addAttribute("message","Password mismatch");
		return "signup";
	}

}
