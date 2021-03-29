package com.sf.springframeworkpetclinic.services.map;


import com.sf.springframeworkpetclinic.model.pet;
import com.sf.springframeworkpetclinic.services.CrudService;

import java.util.Set;

public class petServiceMap extends abstractMapService <pet,Long> implements CrudService<pet,Long> {

    @Override
    public Set<pet> findAll() {
        return super.findAll();
    }

    @Override
    public pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public pet save(pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(pet object) {
        super.delete(object);

    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyID(id);

    }
}
