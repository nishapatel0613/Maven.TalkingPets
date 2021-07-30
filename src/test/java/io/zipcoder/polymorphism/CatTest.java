package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void constructorTest(){
        //Given
        String givenName = "";
        //When

        Cat cat = new Cat();
        String actualName = cat.getPetName();

        //Then
        Assert.assertEquals(givenName,actualName);
    }
    @Test
    public void speakTest(){
        //Given
        Cat cat = new Cat();
        String givenSpeak = "Speaking from Cat class";

        //When
        String actualSpeak = cat.speak();

        //Then
        Assert.assertEquals(givenSpeak,actualSpeak);
    }
}
