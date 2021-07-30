package io.zipcoder.polymorphism;

import java.util.Comparator;

public class Pet implements Comparable<Pet>{

    String petName = "";

    public Pet(){

    }
    public Pet(String petName){
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    public String speak(){
        return "Speaking from Pet class";
    }

    public int compareTo(Pet o) {
        return this.getPetName().compareTo(o.getPetName());
    }

     static class NameComparator<P> implements Comparator<Pet> {

        public int compare(Pet pet1, Pet pet2){
            return pet1.getPetName().compareTo(pet2.getPetName());
        }
    }
}
