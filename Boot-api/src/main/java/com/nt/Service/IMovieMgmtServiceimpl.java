package com.nt.Service;

import java.time.Year;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;

@Service
public class IMovieMgmtServiceimpl implements IMovieMgmtService {
@Autowired	
private IMovieRepo movieRepo;
	@Override
	public String registerMovie(Movie movie) {
		//use repo
		Movie movie1 = movieRepo.save(movie);
		System.out.println();
		return null;
	}

	@Override
	public String UpdateMovieDetaails(Integer mid) {
		Optional<Movie> opt = movieRepo.findById(mid);
		if(opt.isPresent()) {
			Movie movie=opt.get();
		
		}
		return null;
	}
	@Override
	public String UpdateMovie( Movie movie) {
	Optional<Movie> opt = movieRepo.findById(movie.getmid());
	if(opt.isPresent()) {
		movieRepo.save(movie);
		return "movie is updated";
		
		
		
	}
	return null;
	
	}

	@Override
	public String removeAllMovies() {
		long count=movieRepo.count();
		if(count!=0)
			movieRepo.deleteAll();
	
		return count+"no of record are deleted";
	}	
	}


