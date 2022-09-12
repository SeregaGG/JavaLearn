package animals;

import exceptions.WrongFoodException;
import food.Food;
import food.Grass;
import types.EnclosureType;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, EnclosureType enclosure_type) {
        super(name, enclosure_type);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Grass) {
            log.info(String.format("%s eating grass", this.name));
            this.satiety += food.getSatiety_score();
        } else {
            throw new WrongFoodException();
        }
    }
}
