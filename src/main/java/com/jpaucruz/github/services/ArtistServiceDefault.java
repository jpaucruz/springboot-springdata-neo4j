package com.jpaucruz.github.services;//package com.jpaucruz.github.services;

import com.jpaucruz.github.components.ArtistComponent;
import com.jpaucruz.github.model.api.ArtistResponse;
import com.jpaucruz.github.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ArtistServiceDefault implements ArtistService {
  
  private ArtistRepository artistRepository;
  private ArtistComponent artistComponent;
  
  @Autowired
  public ArtistServiceDefault(ArtistRepository artistRepository, ArtistComponent artistComponent) {
    this.artistRepository = artistRepository;
    this.artistComponent = artistComponent;
  }

  @Override
  public List<ArtistResponse> searchArtists() {
  
    return StreamSupport
      .stream(artistRepository.findAll().spliterator(), false)
      .map(artist -> artistComponent.map(artist))
      .collect(Collectors.toList());
    
  }

}