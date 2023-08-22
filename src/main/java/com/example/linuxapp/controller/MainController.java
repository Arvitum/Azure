package com.example.linuxapp.controller;

import com.example.linuxapp.repo.ProductsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final ProductsRepo productsRepo;

//    @Value("${hello.message}")
//    private String hello;
    @GetMapping("/")
    public String helloWorld() {
        return "hello";
    }

    @GetMapping("/getAll")
    public String getAll() {
        return productsRepo.findAll().toString();
    }
}
