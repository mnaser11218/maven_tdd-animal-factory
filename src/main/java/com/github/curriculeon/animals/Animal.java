package com.github.curriculeon.animals;

import com.github.curriculeon.Food;

/**
 * @author leon on 4/19/18.
 */
public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
