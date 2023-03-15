package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestTim {
//    Create a program that asks the user how many pets they have.
//    Once you know how many pets they have, ask them what kind of pet each one is,
//    along with each pet's name. For now your program should just hold onto the user
//    input and print out the list at the end; we'll modify this in part 3.



    @Test
    public void testCreateRedPanda(){
        //given
        Pet panda = new redPanda();
        String expectedGender = "Male";
        String expectedName = "James";

        // When
        Pet panda = new redPanda("James", "Male");

        // Then
        String actualGender = panda.getGender();
        String actualName = panda.getName();

        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testSpeak(){
        Pet panda = new redPanda("James", "Male");
        String expectedSpeak = "Ah!";

        panda.speak();
        Assert.assertEquals(expectedSpeak, "Ah!");

    }
}
