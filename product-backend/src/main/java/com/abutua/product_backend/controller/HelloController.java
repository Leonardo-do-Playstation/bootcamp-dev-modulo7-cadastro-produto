package com.abutua.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping ("hello")
    public String gethello(){
        return "Hello Spring boot";
    }

}
