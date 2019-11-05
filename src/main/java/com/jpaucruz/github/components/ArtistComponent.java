package com.jpaucruz.github.components;

import com.google.common.collect.Lists;
import com.jpaucruz.github.model.api.ArtistResponse;
import com.jpaucruz.github.model.repository.Artist;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class ArtistComponent {
  
  public ArtistResponse map(Artist artist){
  
    List<String> performances = Lists.newArrayList();
    if (Objects.nonNull(artist.getPerformances())) {
      artist.getPerformances().stream().forEach(role -> performances.add(role.getMovie().getTitle()));
    }
    List<String> directions = Lists.newArrayList();
    if (Objects.nonNull(artist.getDirections())) {
      artist.getDirections().stream().forEach(r -> directions.add(r.getTitle()));
    }
    List<String> productions = Lists.newArrayList();
    if (Objects.nonNull(artist.getProductions())) {
      artist.getProductions().stream().forEach(r -> productions.add(r.getTitle()));
    }
  
    return ArtistResponse
      .builder()
      .id(artist.getId())
      .born(artist.getBorn())
      .name(artist.getName())
      .performances(performances)
      .directions(directions)
      .productions(productions)
      .build();
    
  }
  
}
