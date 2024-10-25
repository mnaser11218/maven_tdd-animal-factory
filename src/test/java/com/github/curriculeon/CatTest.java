package com.github.curriculeon;

import com.github.curriculeon.animals.Animal;
import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
        //given
        Cat cat = new Cat("name", new Date(), 1);

        // when
        String expected = "melo";
        cat.setName(expected);

        //then
        Assert.assertEquals(cat.getName(), expected);

    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        Cat cat = new Cat("name", new Date(), 1);
        //when
        String expected = cat.speak();
        //then
        Assert.assertEquals(expected, "meow!");

    }



    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //given
        Cat cat = new Cat("name", new Date(), 1);
        //when
        Date expected = new Date();
        cat.setBirthDate(expected);
        //then
        Assert.assertEquals(cat.getBirthDate(), expected);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //given
        Cat cat = new Cat("name", new Date(), 1);

        //when
        cat.eat(new Food());
        int expected = cat.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(1, expected);


    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //given
        Cat cat = new Cat("name", new Date(), 1);
        //then
        int id = cat.getId();
        Assert.assertEquals(1, id);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        Cat cat = new Cat("name", new Date(), 1);

        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testMammalnheritance(){
        Cat cat = new Cat("name", new Date(), 1);

        Assert.assertTrue(cat instanceof Mammal);
    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
