package com.sf.springframeworkpetclinic.BootStrap;

import com.sf.springframeworkpetclinic.model.*;
import com.sf.springframeworkpetclinic.services.OwnerService;
import com.sf.springframeworkpetclinic.services.PetTypeService;
import com.sf.springframeworkpetclinic.services.Vetservice;
import com.sf.springframeworkpetclinic.services.specialityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerservice;

    private final Vetservice vetservice;
    private final PetTypeService pettypeService;
    private final specialityService specialityservice;


    public DataLoader(OwnerService ownerservice, Vetservice vetservice, PetTypeService pettypeService, specialityService specialityservice) {

        this.ownerservice = ownerservice;
        this.vetservice = vetservice;
        this.pettypeService = pettypeService;
        this.specialityservice = specialityservice;
    }



    @Override
    public void run(String... args) throws Exception {
        int count =pettypeService.findAll().size();
        if(count==0){
            loaddata();
        }


    }

    private void loaddata() {
        pettype dog=new pettype();
        dog.setPettype("Dog");
        pettype saveddogtype =pettypeService.save(dog);

        pettype cat=new pettype();
        dog.setPettype("Cat");
        pettype savedcattype=pettypeService.save(cat);

        Speciality dentist=new Speciality();
        dentist.setDescription("Dentist");
        specialityservice.save(dentist);

        Speciality gynocolgist=new Speciality();
        gynocolgist.setDescription("Gynocolgist");
        specialityservice.save(gynocolgist);

        Speciality surgery=new Speciality();
        surgery.setDescription("Surgery");
        specialityservice.save(surgery);

        Owner owner1=new Owner();
        owner1.setFirstName("haritha");
        owner1.setLastName("naidu");
        owner1.setAddress("Kansas");
        owner1.setTelephone("816");
        owner1.setAddress("paseo");
        ownerservice.save(owner1);
        pet haripets=new pet();
        haripets.setPetType(savedcattype);
        haripets.setOwner(owner1);
        haripets.setDateofbirth(LocalDate.now());
        owner1.getPets().add(haripets);


        Owner owner2=new Owner();

        owner2.setFirstName("siva");
        owner2.setLastName("pabolu");
        owner2.setAddress("Kansas");
        owner2.setTelephone("521");
        owner2.setAddress("homes");
        ownerservice.save(owner2);
        pet sivapets=new pet();
        sivapets.setPetType(saveddogtype);
        sivapets.setOwner(owner2);
        sivapets.setDateofbirth(LocalDate.now());
        owner1.getPets().add(sivapets);

        System.out.println("Loaded Owners");

        vet v1=new vet();

        v1.setFirstName("Bobby");
        v1.setLastName("jjj");
        vetservice.save(v1);
        v1.getSpecialities().add(dentist);


        vet v2=new vet();

        v1.setFirstName("Teddy");
        v1.setLastName("kkk");
        vetservice.save(v2);
        v2.getSpecialities().add(gynocolgist);


        vet v3=new vet();
        v3.setFirstName("kutti");
        v3.setLastName("hvbv");
        vetservice.save(v3);
        v3.getSpecialities().add(surgery);
        System.out.println("Loaded vets");
    }
}
