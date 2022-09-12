package services;

import animals.Animal;
import animals.Voice;
import food.Food;
import food.Meat;

public class Worker extends Meat { // :D
    private final String name;
    private final int weight;
    public void feed(Animal animal, Food food) {
        animal.eat(food);
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
