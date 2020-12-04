package com.zuul.api.gateway.apigatewaydemo;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRouter(RouterLocatorBuilder builder){
        return builder.routes()
                .route(r -> (r.path("/topHeadlines/**"))
                        .uri("http://localhost:8080/")
                        .id("topHeadline"))
                .build();
    }
}
