package com.sf.springframeworkpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{
    private LocalDate date;
    private String Description;
    private pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public com.sf.springframeworkpetclinic.model.pet getPet() {
        return pet;
    }

    public void setPet(com.sf.springframeworkpetclinic.model.pet pet) {
        this.pet = pet;
    }
}
