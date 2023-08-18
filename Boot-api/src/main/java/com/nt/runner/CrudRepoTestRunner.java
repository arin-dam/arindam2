package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.Service.IMovieMgmtService;
import com.nt.entity.Movie;

public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		Movie movie =new Movie();
		movie.setRating(7.8f);
		try {
		System.out.println( service.registerMovie(movie));
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}


