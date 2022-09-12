package services;

import animals.Animal;
import animals.Voice;
import exceptions.WrongFoodException;
import food.Food;
import food.Meat;
import org.apache.log4j.Logger;

public class Worker extends Meat { // :D
    private final String name;
    private final int weight;
    private static final Logger log = Logger.getLogger(Worker.class);
    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);
        } catch (WrongFoodException exception) {
            log.error(exception);
        }
    }
    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }

    public Worker(String name, int weight) {
        super(weight);
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
