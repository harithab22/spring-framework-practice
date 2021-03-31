package hari.springframework.pets;

public class Petservicefactory {
    public PetService getPetService(String pettype){
        switch (pettype){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }

    }
}
