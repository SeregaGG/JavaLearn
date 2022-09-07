package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.printf("%s eating grass\n", this.name);
            this.satiety += food.getSatiety_score();
        }
        else {
            System.out.println("Wrong food!");
        }
    }
}
