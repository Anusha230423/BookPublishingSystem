package com.anusha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anusha.model.Movie;
import com.anusha.service.MovieService;

@Controller
@RequestMapping("movie")
public class MovieController {
@Autowired
private MovieService movieservice;
@GetMapping
public String list(ModelMap modelMap)
{
	List<Movie> movies=movieservice.findAll();
	System.out.println(movies);
	modelMap.addAttribute("MOVIES_LIST",movies);
	return "movie/list";
}

}
