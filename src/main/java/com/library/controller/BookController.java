package com.library.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/get")
    public String getHome(){
        return "home";
    }
}
