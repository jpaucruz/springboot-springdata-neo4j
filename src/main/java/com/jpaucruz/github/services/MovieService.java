package com.jpaucruz.github.services;//package com.jpaucruz.github.services;

import com.jpaucruz.github.model.api.MovieResponse;

import java.util.List;

public interface MovieService {

  List<MovieResponse> searchMovies();

}

