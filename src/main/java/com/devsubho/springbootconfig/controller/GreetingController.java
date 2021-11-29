package com.devsubho.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author subha
 * @project springboot-config
 * @created 29/11/2021 - 19:08
 * @user subha
 */

@RestController
public class GreetingController {

    @Value("${my.greeting: default value}")
    private String greetingMessage;

    @Value("some static message")
    private String staticMessage;

    @Value("${my.list.values}")
    private List<String> listValues;

    @Autowired
    private Environment env;

    @GetMapping("/greeting")
    public String greeting() { return greetingMessage + staticMessage + listValues; }

    @GetMapping("/envdetails")
    public String envDetails() {
        return env.toString();
    }
}
