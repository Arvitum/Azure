package com.example.linuxapp.controller;

import com.example.linuxapp.repo.ProductsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final ProductsRepo productsRepo;

    @GetMapping("/")
    public String helloWorld() {
        return "New test with connection string!";
    }

    @GetMapping("/getAll")
    public String getAll() {
        return productsRepo.findAll().toString();
    }
}
