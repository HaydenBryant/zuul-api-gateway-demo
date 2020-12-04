package com.zuul.api.gateway.apigatewaydemo.controller;

import com.zuul.api.gateway.apigatewaydemo.service.NewsGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GatewayController {

    @Autowired
    private NewsGatewayService service;

    @GetMapping("/topHeadlines")
    public String getTopHeadlines(){
        return service.getTopHeadlines();
    }

    @GetMapping("/search/{keyword}")
    public String searchFor(@PathVariable String keyword){
        return service.searchFor(keyword);
    }

}
