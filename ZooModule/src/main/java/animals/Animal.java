package animals;

import food.Food;

public abstract class Animal {

    protected int satiety = 10;
    protected String name;
    public abstract void eat(Food food);

}
