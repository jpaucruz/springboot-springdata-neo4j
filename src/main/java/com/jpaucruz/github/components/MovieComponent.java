package com.jpaucruz.github.components;

import com.jpaucruz.github.model.api.MovieResponse;
import com.jpaucruz.github.model.repository.Movie;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieComponent {
  
  public MovieResponse map(Movie movie){
  
    Map<List<String>, String> cast = new HashMap<>();
    movie.getCast().stream().forEach(r -> cast.put(r.getRoles(), r.getActor().getName()));
  
    return MovieResponse
      .builder()
      .id(movie.getId())
      .released(movie.getReleased())
      .tagline(movie.getTagline())
      .title(movie.getTitle())
      .cast(cast)
      .build();
    
  }
  
}
