package io.zipcoder.polymorphism;

public class Pig extends Pet{
    public Pig() {
    }

    public Pig(String petName) {
        super(petName);
    }

    @Override
    public String speak(){
        return "Speaking from Pig class";
    }
}
