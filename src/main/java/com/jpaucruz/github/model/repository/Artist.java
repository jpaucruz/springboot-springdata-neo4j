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
@NodeEntity("Person")
@JsonIgnoreProperties("artist")
public class Artist {
  
  @Id
  @GeneratedValue
  private long id;
  
  @Property("name")
  private String name;
  
  @Property("born")
  private int born;
  
  @Relationship(type = "ACTED_IN")
  private List<Role> performances;
  
  @Relationship(type = "PRODUCED")
  private List<Movie> productions;
  
  @Relationship(type = "DIRECTED")
  private List<Movie> directions;
  
}
