package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PigTest {
    @Test
    public void constructorTest(){
        //Given
        String givenName = "";
        //When

        Pig pig = new Pig();
        String actualName = pig.getPetName();

        //Then
        Assert.assertEquals(givenName,actualName);
    }
    @Test
    public void speakTest(){
        //Given
        Pig pig = new Pig();
        String givenSpeak = "Speaking from Pig class";

        //When
        String actualSpeak = pig.speak();

        //Then
        Assert.assertEquals(givenSpeak,actualSpeak);
    }
}
