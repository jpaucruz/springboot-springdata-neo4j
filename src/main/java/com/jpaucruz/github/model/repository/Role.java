package com.jpaucruz.github.model.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "ACTED_IN")
public class Role {

  @Id
  @GeneratedValue
  private Long id;
  
  private List<String> roles = new ArrayList<>();

  @StartNode
  private Artist actor;

  @EndNode
  private Movie movie;

}