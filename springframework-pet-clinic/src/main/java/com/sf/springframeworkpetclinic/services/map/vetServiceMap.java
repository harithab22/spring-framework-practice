package com.sf.springframeworkpetclinic.services.map;


import com.sf.springframeworkpetclinic.model.Speciality;
import com.sf.springframeworkpetclinic.model.vet;
import com.sf.springframeworkpetclinic.services.Vetservice;
import com.sf.springframeworkpetclinic.services.specialityService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class vetServiceMap extends abstractMapService <vet,Long> implements Vetservice {

    private final specialityService speialityService;

    public vetServiceMap(specialityService speialityService) {
        this.speialityService = speialityService;
    }

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
        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = speialityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
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
