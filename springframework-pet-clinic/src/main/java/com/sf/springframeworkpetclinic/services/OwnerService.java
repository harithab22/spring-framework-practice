package com.sf.springframeworkpetclinic.services;

import com.sf.springframeworkpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);



}
