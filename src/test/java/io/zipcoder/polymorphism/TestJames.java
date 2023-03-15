package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

public class TestJames {
@Test
    public void testCreateDog(){
    // Given
    String expectedName = "PimTark";
    Integer expectedAge = 2;

    // When
    Pet dog = new Pet();
    String actualName = dog.getName();
    Integer actualAge = dog.getAge();
    // Then
    Assert.assertEquals(expectedName, actualName);
    Assert.assertEquals(expectedAge, actualAge);
    }
    public void testSetName(){
    // Given
    String expectedName = "PimTark";
    // When
    Pet dog =  new Pet();
    String actualName = dog.setName();

    // Then
    Assert.assertEquals(expectedName, actualName);
    }
    public void testSpeak(){
        // Given
        String expectedSpeak = "Woof!";
        Pet dog = new Pet();

        // When
        dog.speak();

        // Then
        Assert.assertEquals(expectedSpeak, "Woof!");
    }
    public void testGetName(){
        // Given


        // When


        // Then



    }


}

