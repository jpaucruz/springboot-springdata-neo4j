package com.jpaucruz.github.model.api;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ArtistResponse {
  
  private long id;
  private String name;
  private int born;
  private List<String> performances;
  private List<String> directions;
  private List<String> productions;
  
}
