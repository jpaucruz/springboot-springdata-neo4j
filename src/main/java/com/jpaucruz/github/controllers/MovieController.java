package com.jpaucruz.github.controllers;

import com.jpaucruz.github.model.api.MovieResponse;
import com.jpaucruz.github.services.MovieService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/movies")
@Api(tags = "Movies")
public class MovieController {
  
  private MovieService movieService;
  
  @Autowired
  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }
  
  @ResponseStatus(HttpStatus.OK)
  @GetMapping(
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  public List<MovieResponse> searchMovies() {
    return movieService.searchMovies();
  }

}