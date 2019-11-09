package com.jpaucruz.github.controllers;

import com.jpaucruz.github.model.api.ArtistResponse;
import com.jpaucruz.github.services.ArtistService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/artist")
@Api(tags = "Artists")
public class ArtistController {
  
  private ArtistService artistService;
  
  @Autowired
  public ArtistController(ArtistService artistService) {
    this.artistService = artistService;
  }
  
  @ResponseStatus(HttpStatus.OK)
  @GetMapping(
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  public List<ArtistResponse> searchArtists() {
    return artistService.searchArtists();
  }

}