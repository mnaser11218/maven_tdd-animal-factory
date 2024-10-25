package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.animal_storage.CatHouse;
//import com.sun.tools.javac.util.Assert;
import org.junit.Assert;

import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        CatHouse.add(new Cat("hl", new Date(), 1));
        int numberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, 1);
        CatHouse.clear();

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemove(){
        CatHouse.add(new Cat("hl", new Date(), 1));
        CatHouse.remove(1);
        int numberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, 0);
        CatHouse.clear();

    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat(){
        Cat cat = new Cat("hl", new Date(), 1);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        int numberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, 0);
        CatHouse.clear();

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void testGetCatById(){
        int id = 4;
        Cat cat = new Cat("hl", new Date(), id);
        CatHouse.add(cat);
        Cat catById = CatHouse.getCatById(4);
        Assert.assertEquals(cat, catById);
        CatHouse.clear();

    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){

        Cat cat1 = new Cat("hl", new Date(), 1);
        Cat cat2 = new Cat("hl", new Date(), 2);
        Cat cat3 = new Cat("hl", new Date(), 2);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);

        int numberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, 3);
        CatHouse.clear();

    }
}
