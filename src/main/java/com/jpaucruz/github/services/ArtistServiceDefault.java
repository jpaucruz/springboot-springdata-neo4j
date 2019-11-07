package com.jpaucruz.github.services;//package com.jpaucruz.github.services;

import com.jpaucruz.github.model.Artist;
import com.jpaucruz.github.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ArtistServiceDefault implements ArtistService {

  private ArtistRepository artistRepository;

  @Autowired
  public ArtistServiceDefault(ArtistRepository artistRepository) {
    this.artistRepository = artistRepository;
  }

  @Override
  public List<Artist> searchArtists() {
    return StreamSupport.stream(artistRepository.findAll().spliterator(), true).collect(Collectors.toList());
  }

}