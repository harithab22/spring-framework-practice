package com.sf.springframeworkpetclinic.services.map;

import com.sf.springframeworkpetclinic.model.Owner;
import com.sf.springframeworkpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends abstractMapService <Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyID(id);

    }
}
