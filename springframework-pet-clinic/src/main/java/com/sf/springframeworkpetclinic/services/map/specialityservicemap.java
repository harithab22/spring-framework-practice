package com.sf.springframeworkpetclinic.services.map;

import com.sf.springframeworkpetclinic.model.Speciality;
import com.sf.springframeworkpetclinic.services.specialityService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class specialityservicemap extends abstractMapService<Speciality,Long> implements specialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyID(id);

    }


}