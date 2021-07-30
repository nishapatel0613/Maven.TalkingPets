package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PetTest {
    Pet pet = new Pet();

    @Test
    public void constructorTest(){
        //Given
        String givenName = "";

        //When
        String actualName = pet.getPetName();

        //Then
        Assert.assertEquals(givenName,actualName);
    }
    @Test
    public void speakTest(){
        //Given
        String given = "Speaking from Pet class";

        //When

        String actual = pet.speak();

        //Then
        Assert.assertEquals(given,actual);
    }
    @Test
    public void printTest(){
       //Given
        String givenName1 = "Simmi";
        String givenName2 = "Bingo";
        String givenName3 = "Peppa";

       //When
        Cat cat = new Cat(givenName1);
        Dog dog = new Dog(givenName2);
        Pig pig = new Pig(givenName3);

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(cat);
        pets.add(dog);
        pets.add(pig);
        Console console = new Console();

        //Then
        console.printResults(pets);


    }
}
