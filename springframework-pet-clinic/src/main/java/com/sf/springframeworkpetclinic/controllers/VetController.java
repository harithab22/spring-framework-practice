package com.sf.springframeworkpetclinic.controllers;

import com.sf.springframeworkpetclinic.services.Vetservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    private final Vetservice vetservice;

    public VetController(Vetservice vetservice) {
        this.vetservice = vetservice;
    }

    @RequestMapping({"vets","/vets/index","/vets/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetservice.findAll());
        return "vets/index";
    }
}
