package com.jpaucruz.github.model.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieResponse {
  
  private long id;
  private String title;
  private int released;
  private String tagline;
  private Map<List<String>, String> cast;
  
}
