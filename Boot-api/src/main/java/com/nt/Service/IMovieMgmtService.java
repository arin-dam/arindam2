package com.nt.Service;

import com.nt.entity.Movie;

public interface IMovieMgmtService {
	public String registerMovie(Movie movie);
	public String UpdateMovieDetaails(Integer mid);
	public String UpdateMovie(Movie movie);
	public String removeAllMovies();

}
