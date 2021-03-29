package com.sf.springframeworkpetclinic.services.map;


import com.sf.springframeworkpetclinic.model.vet;
import com.sf.springframeworkpetclinic.services.CrudService;

import java.util.Set;

public class vetServiceMap extends abstractMapService <vet,Long> implements CrudService<vet,Long> {

    @Override
    public Set<vet> findAll() {
        return super.findAll();
    }

    @Override
    public vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public vet save(vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(vet object) {
        super.delete(object);

    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyID(id);

    }
}
