package com.kt.training.controller;


import com.kt.training.repositories.authorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class authorController {

    private final authorRepository authorRepository;

    public authorController(com.kt.training.repositories.authorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());


        return "books/authors/list";
    }
}
