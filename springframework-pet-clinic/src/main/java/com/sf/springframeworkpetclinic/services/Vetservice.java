package com.sf.springframeworkpetclinic.services;


import com.sf.springframeworkpetclinic.model.vet;

import java.util.Set;

public interface Vetservice {
    vet findById(Long id);
    vet save(vet owner);
    Set<vet> findAll();
}
