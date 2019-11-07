package com.jpaucruz.github.repositories;

import com.jpaucruz.github.model.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
  
  Movie findByTitle(@Param("title") String title);
  
  Collection<Movie> findByTitleLike(@Param("title") String title);
  
  @Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m,r,a LIMIT {limit}")
  Collection<Movie> graph(@Param("limit") int limit);

}
