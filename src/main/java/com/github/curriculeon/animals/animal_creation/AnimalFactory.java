package com.github.curriculeon.animals.animal_creation;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Dog;
import com.github.curriculeon.animals.animal_storage.CatHouse;
import com.github.curriculeon.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 * This class is responsible for creating animals and automatically assigning them an id
 */
public class AnimalFactory {
    public static Dog createDog(String name, Date birthDate) {
        Integer newId = DogHouse.getNumberOfDogs();
        return new Dog(name, birthDate, newId);
    }

    public static Cat createCat(String name, Date birthDate) {
        Integer newId = CatHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
    }
}
