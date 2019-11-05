package com.jpaucruz.github.services;//package com.jpaucruz.github.services;

import com.jpaucruz.github.components.MovieComponent;
import com.jpaucruz.github.model.api.MovieResponse;
import com.jpaucruz.github.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MovieServiceDefault implements MovieService {
  
  private MovieRepository movieRepository;
  private MovieComponent movieComponent;
  
  @Autowired
  public MovieServiceDefault(MovieRepository movieRepository, MovieComponent movieComponent) {
    this.movieRepository = movieRepository;
    this.movieComponent = movieComponent;
  }
  
  @Override
  public List<MovieResponse> searchMovies() {
    
    return StreamSupport
      .stream(movieRepository.findAll().spliterator(), false)
      .map(movie -> movieComponent.map(movie))
      .collect(Collectors.toList());
    
  }
  
}
