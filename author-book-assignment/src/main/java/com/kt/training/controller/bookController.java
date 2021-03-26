package com.kt.training.controller;

import com.kt.training.repositories.bookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bookController {

    private final bookRepository bookRepository;

    public bookController(com.kt.training.repositories.bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @RequestMapping("/books")
    public String getbooks(Model model){

        model.addAttribute("books",bookRepository.findAll());

        return "books/list";

    }
}
