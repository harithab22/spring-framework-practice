package com.sf.springframeworkpetclinic.BootStrap;

import com.sf.springframeworkpetclinic.model.Owner;
import com.sf.springframeworkpetclinic.model.vet;
import com.sf.springframeworkpetclinic.services.OwnerService;
import com.sf.springframeworkpetclinic.services.Vetservice;
import com.sf.springframeworkpetclinic.services.map.OwnerServiceMap;
import com.sf.springframeworkpetclinic.services.map.vetServiceMap;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerservice;

    private final Vetservice vetservice;

    public DataLoader() {
         ownerservice=new OwnerServiceMap();
         vetservice=new vetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("haritha");
        owner1.setLastName("naidu");
        ownerservice.save(owner1);


        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("siva");
        owner2.setLastName("pabolu");
        ownerservice.save(owner2);

        System.out.println("Loaded Owners");

        vet v1=new vet();
        v1.setId(1L);
        v1.setFirstName("Bobby");
        v1.setLastName("jjj");
        vetservice.save(v1);

        vet v2=new vet();
        v1.setId(2L);
        v1.setFirstName("Teddy");
        v1.setLastName("kkk");
        vetservice.save(v2);
        System.out.println("Loaded vets");











    }
}
