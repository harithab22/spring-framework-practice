package com.sf.springframeworkpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pet_types")
public class pettype extends BaseEntity {
    @Column(name = "pet_type")
    private String pettype;

    public String getPettype() {
        return pettype;
    }

    public void setPettype(String pettype) {
        this.pettype = pettype;
    }
}
