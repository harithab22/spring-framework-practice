package com.sf.springframeworkpetclinic.services.map;

import com.sf.springframeworkpetclinic.model.pettype;
import com.sf.springframeworkpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends abstractMapService<pettype,Long> implements PetTypeService{
    @Override
    public Set<pettype> findAll() {
        return super.findAll();
    }

    @Override
    public pettype findById(Long id) {
        return super.findById(id);
    }

    @Override
    public pettype save(pettype object) {
        return super.save(object);
    }

    @Override
    public void delete(pettype object) {
        super.delete(object);

    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyID(id);

    }


}