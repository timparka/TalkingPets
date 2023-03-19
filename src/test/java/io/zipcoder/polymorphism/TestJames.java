package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

public class TestJames {
    @Test
    public void name() {
    }

    @Test
    public void testCreateDog(){
    // Given
    String expectedName = "PimTark";
    Integer expectedAge = 2;

    // When
    Dog dog = new Dog("PimTark", 2);
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
    Dog dog = new Dog("PimTark", 90);
    String actualName = dog.setName();

    // Then
    Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testSpeak(){
        // Given
        String name = "Tim";
        int age = 60;
        Pet dog = new Dog(name, age);
        String expectedSpeak = "Woof!";
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

