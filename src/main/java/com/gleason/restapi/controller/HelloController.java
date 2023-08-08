package com.gleason.restapi.controller;

import com.gleason.restapi.model.Hello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/hello")
@RestController
public class HelloController {

    String hello;

    public HelloController(@Value("${HELLO}") String hello) {
        this.hello = hello;
    }

    @GetMapping
    public Hello getHello(){
        return new Hello(hello);
    }
}
