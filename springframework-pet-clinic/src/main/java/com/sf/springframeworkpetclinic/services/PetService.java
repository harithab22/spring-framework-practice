package com.sf.springframeworkpetclinic.services;


import com.sf.springframeworkpetclinic.model.pet;

import java.util.Set;

public interface PetService {
    pet findById(Long id);
    pet save(pet pet);
    Set<pet> findAll();
}
