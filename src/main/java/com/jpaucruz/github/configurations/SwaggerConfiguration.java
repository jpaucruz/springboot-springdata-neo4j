package com.jpaucruz.github.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

  private static final String API_TITLE = "Spring Boot and Neo4J using Spring Data";
  private static final String API_DESCRIPTION = "This API supports Neo4J operations";

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
      .useDefaultResponseMessages(false)
      .apiInfo(apiInfo())
      .select()
      .paths(regex("/api/.*"))
      .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
      .title(API_TITLE)
      .description(API_DESCRIPTION)
      .build();
  }

}