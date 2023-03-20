package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {

    @Test
    public void testCreatePet(){
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
    @Test
    public void testSetName(){
    // Given
    String expectedName = "PimTark";
    // When
    Dog dog = new Dog("PimTark", 90);
    String actualName = dog.setName();
    // Then
    Assert.assertEquals(expectedName, dog.getName());
    }
    @Test
    public void testSpeak(){
        // Given
        String name = "Tim";
        int age = 60;
        Pet dog = new Dog(name, age);
        String expectedSpeak = "Bark!";
        // When
        dog.speak();

        // Then
        Assert.assertEquals(expectedSpeak, dog.speak());
    }
    @Test
    public void testGetName(){
        // Given
        String expectedName = "PimTark";
        int age = 5;
        Dog dog = new Dog(expectedName,age);
        // When
        String actualName = dog.getName();

        // Then
        Assert.assertEquals(expectedName,actualName);
    }
    @Test
    public void testConstructor() {
        // Given
        String expectedName = "PimTark";
        int age = 2;
        Dog dog = new Dog(expectedName, age);
        // When
        String actualName = dog.getName();
        int actualAge = dog.getAge();
        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(age, actualAge);
    }

}

