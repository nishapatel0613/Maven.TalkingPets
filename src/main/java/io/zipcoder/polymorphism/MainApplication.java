package io.zipcoder.polymorphism;


public class MainApplication {
    public static void main(String[] args) {
        Console console = new Console();
        Integer noOfPets = console.getNumberOfPets();
        console.acceptName(noOfPets);
        console.printResults(console.pets);




    }

}
