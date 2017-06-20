package com.anusha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anusha.model.Movie;
import com.anusha.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	 private MovieRepository movierepository;
	public List<Movie> findAll()
	{
		return movierepository.findAll();
	}
	
}
