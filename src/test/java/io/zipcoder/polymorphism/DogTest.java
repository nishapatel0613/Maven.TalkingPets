package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void constructorTest(){
        //Given
        String givenName = "";
        //When

        Dog dog = new Dog();
        String actualName = dog.getPetName();

        //Then
        Assert.assertEquals(givenName,actualName);
    }
    @Test
    public void speakTest(){
        //Given
        Dog dog = new Dog();
        String givenSpeak = "Speaking from Dog class";

        //When
        String actualSpeak = dog.speak();

        //Then
        Assert.assertEquals(givenSpeak,actualSpeak);
    }
}
