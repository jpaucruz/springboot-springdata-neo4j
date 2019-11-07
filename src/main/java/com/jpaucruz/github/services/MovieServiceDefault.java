package com.jpaucruz.github.services;//package com.jpaucruz.github.services;

import com.jpaucruz.github.model.Movie;
import com.jpaucruz.github.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MovieServiceDefault implements MovieService {

  private MovieRepository movieRepository;

  @Autowired
  public MovieServiceDefault(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public List<Movie> searchMovies() {
    return StreamSupport.stream(movieRepository.findAll().spliterator(), false).collect(Collectors.toList());
  }

}
