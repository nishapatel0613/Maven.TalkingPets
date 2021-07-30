package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String petName) {
        super(petName);
    }

    @Override
    public String speak(){
        return "Speaking from Dog class";
    }
}
