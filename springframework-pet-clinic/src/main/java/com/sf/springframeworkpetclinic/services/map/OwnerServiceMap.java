package com.sf.springframeworkpetclinic.services.map;

import com.sf.springframeworkpetclinic.model.Owner;
import com.sf.springframeworkpetclinic.services.OwnerService;
import com.sf.springframeworkpetclinic.services.PetService;
import com.sf.springframeworkpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends abstractMapService <Owner,Long> implements OwnerService {

   private final PetService petService;
   private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

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
        if(object != null){
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        com.sf.springframeworkpetclinic.model.pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }

            return super.save(object);

        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyID(id);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
