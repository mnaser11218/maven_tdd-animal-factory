package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Dog;
import com.github.curriculeon.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateDog(){

        //when
        Date date = new Date();
        String name = "doger";
        Dog dog = AnimalFactory.createDog(name, date);

        // then
        Assert.assertEquals(dog.getName(), name);
        Assert.assertEquals(dog.getBirthDate(), date);

    }

    @Test
    public void testCreateCat(){
        //when
        Date date = new Date();
        String name = "cater";
        Cat cat = AnimalFactory.createCat(name, date);

        // then
        Assert.assertEquals(cat.getName(), name);
        Assert.assertEquals(cat.getBirthDate(), date);
    }

}
