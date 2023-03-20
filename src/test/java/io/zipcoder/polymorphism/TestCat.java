package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {
    @Test
    public void testConstructor() {
        // Given
        String expectedName = "mr. popo";
        int expectedAge = 55;
        Cat cat = new Cat(expectedName, expectedAge);
        // When
        String actualName = cat.getName();
        int actualAge = cat.getAge();
        // Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testSpeak(){
        // Given
        String expectedSpeak = "Meow!";
        Cat cat = new Cat("Harambe", 40);
        // When
        String actualSpeak = cat.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }
}
