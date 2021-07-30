package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String petName) {
        super(petName);
    }

    @Override
    public String speak(){
        return "Speaking from Cat class";
    }
}
