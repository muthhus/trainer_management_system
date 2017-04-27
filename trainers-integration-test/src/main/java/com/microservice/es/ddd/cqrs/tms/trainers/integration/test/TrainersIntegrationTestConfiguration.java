package com.microservice.es.ddd.cqrs.tms.trainers.integration.test;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Configuration

@EnableAutoConfiguration

public class TrainersIntegrationTestConfiguration {
	  @Bean
	  public RestTemplate restTemplate(HttpMessageConverters converters) {
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.setErrorHandler(new DefaultResponseErrorHandler() {
	      @Override
	      protected boolean hasError(HttpStatus statusCode) {
	        return statusCode != HttpStatus.NOT_FOUND && super.hasError(statusCode);
	      }
	    });
	    List<? extends HttpMessageConverter<?>> httpMessageConverters = Collections.singletonList(new MappingJackson2HttpMessageConverter());
	    restTemplate.setMessageConverters((List<HttpMessageConverter<?>>) httpMessageConverters);
	    return restTemplate;
	  }
}
