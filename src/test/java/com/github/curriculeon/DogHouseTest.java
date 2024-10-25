package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Dog;
import com.github.curriculeon.animals.animal_creation.AnimalFactory;
import com.github.curriculeon.animals.animal_storage.CatHouse;
import com.github.curriculeon.animals.animal_storage.DogHouse;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testAddDog(){
        DogHouse.add(new Dog("hl", new Date(), 1));
        int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numberOfDogs, 1);
        DogHouse.clear();

    }

    @Test
    public void testRemove(){
        DogHouse.add(new Dog("hl", new Date(), 1));
        DogHouse.remove(1);
        int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numberOfDogs, 0);
        DogHouse.clear();

    }
    @Test
    public void testRemoveDog(){
        Dog dog = new Dog("hl", new Date(), 1);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numberOfDogs, 0);
        DogHouse.clear();

    }

    @Test
    public void testGetDogById(){
        int id = 4;
        Dog dog = new Dog("hl", new Date(), id);
        DogHouse.add(dog);
        Dog dogById = DogHouse.getDogById(4);
        Assert.assertEquals(dog, dogById);
        DogHouse.clear();

    }

    @Test
    public void testGetNumberOfDogs(){

        Dog dog1 = new Dog("hl", new Date(), 1);
        Dog dog2 = new Dog("hl", new Date(), 2);
        Dog dog3 = new Dog("hl", new Date(), 2);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);

        int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numberOfDogs, 3);
        DogHouse.clear();

    }
//    @Test
//    public void testGetNumberOfDogs() {
//        // Given (some
//        String name = "Milo";
//        Date birthDate = new Date();
//        Dog animal = AnimalFactory.createDog(name, birthDate);
//        DogHouse.clear();
//
//        // When
//        DogHouse.add(animal);
//
//        // Then
//        DogHouse.getNumberOfDogs();
//    }
}
