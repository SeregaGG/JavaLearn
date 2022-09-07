package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.printf("%s eating meat\n", this.name);
            this.satiety += food.getSatiety_score();
        }
        else {
            System.out.println("Wrong food!");
        }
    }
}
