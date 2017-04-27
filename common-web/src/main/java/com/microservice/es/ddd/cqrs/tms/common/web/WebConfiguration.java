package com.microservice.es.ddd.cqrs.tms.common.web;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public ServletListenerRegistrationBean<RequestContextListener> httpRequestContextListener() {
        return new ServletListenerRegistrationBean<RequestContextListener>(new RequestContextListener());
    }

}
