package com.example.springjokesapp.controllers;

import com.example.springjokesapp.services.jokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokecontroller {

    private final jokesService jokeService;

    public jokecontroller(jokesService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}