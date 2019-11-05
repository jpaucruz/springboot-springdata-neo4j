package com.jpaucruz.github.model.repository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NodeEntity("Movie")
public class Movie {
  
  @Id
  @GeneratedValue
  private long id;
  
  @Property("title")
  private String title;
  
  @Property("released")
  private int released;

  @Property("tagline")
  private String tagline;
  
  @JsonIgnoreProperties("movie")
  @Relationship(type = "ACTED_IN", direction = Relationship.INCOMING)
  private List<Role> cast;
  
}
