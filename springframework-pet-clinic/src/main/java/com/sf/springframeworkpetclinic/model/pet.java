package com.sf.springframeworkpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="pets")
public class pet extends BaseEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name="type_id")
    private pettype petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "Birth_date")
    private LocalDate dateofbirth;

    public String getName() {
        return name;
    }

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
