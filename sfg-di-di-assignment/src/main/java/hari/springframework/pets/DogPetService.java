package hari.springframework.pets;

//@Service
//@Profile({"dog", "default"})
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
