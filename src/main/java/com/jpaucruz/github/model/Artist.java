package com.jpaucruz.github.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NodeEntity("Person")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Artist {
  
  @Id
  @GeneratedValue
  private long id;
  
  @Property("name")
  private String name;
  
  @Property("born")
  private int born;
  
  @Relationship(type = "ACTED_IN")
  private List<Movie> movies = new ArrayList<>();
  
}
