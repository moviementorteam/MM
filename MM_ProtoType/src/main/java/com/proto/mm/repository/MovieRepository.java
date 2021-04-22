package com.proto.mm.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proto.mm.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, BigDecimal>{
	
	public Movie findByMovieTitle(String movieTitle);
	
	public List<Movie> findByMovieTitle(String movieTitle, Sort sort);
	
	public Movie findByMovieCode(BigDecimal movieCode);
	

}
