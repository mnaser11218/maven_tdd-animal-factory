package com.github.curriculeon;

import com.github.curriculeon.animals.Animal;
import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testSetName(){
        //given
        Dog dog = new Dog("name", new Date(), 1);

        // when
        String expected = "melo";
        dog.setName(expected);

        //then
        Assert.assertEquals(dog.getName(), expected);

    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        Dog dog = new Dog("name", new Date(), 1);
        //when
        String expected = dog.speak();
        //then
        Assert.assertEquals(expected, "bark!");

    }



    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //given
        Dog dog = new Dog("name", new Date(), 1);
        //when
        Date expected = new Date();
        dog.setBirthDate(expected);
        //then
        Assert.assertEquals(dog.getBirthDate(), expected);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //given
        Dog dog = new Dog("name", new Date(), 1);

        //when
        dog.eat(new Food());
        int expected = dog.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(1, expected);


    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //given
        Dog dog = new Dog("name", new Date(), 1);
        //then
        int id = dog.getId();
        Assert.assertEquals(1, id);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        Dog dog = new Dog("name", new Date(), 1);

        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testMammalnheritance(){
        Dog dog = new Dog("name", new Date(), 1);

        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
