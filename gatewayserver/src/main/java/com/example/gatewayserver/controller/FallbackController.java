package com.example.gatewayserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/contactSupport")
    public Mono<String> contactSupport(){
        return Mono.just("An error occured, please contact support tesm");
    }
}
