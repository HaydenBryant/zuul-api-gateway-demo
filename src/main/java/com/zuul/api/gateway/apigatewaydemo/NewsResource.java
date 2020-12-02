package com.zuul.api.gateway.apigatewaydemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsResource {

    @Value("${api.key}")
    private String apiKey;

    @RequestMapping("http://newsapi.org/v2/top-headlines?country=us")
    public String getNews(){
        String news -
    }
}
