package com.sf.springframeworkpetclinic.model;

import java.time.LocalDate;

public class pet {
    private pettype petType;
    private Owner owner;
    private LocalDate dateofbirth;

    public pettype getPetType() {
        return petType;
    }

    public void setPetType(pettype petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
