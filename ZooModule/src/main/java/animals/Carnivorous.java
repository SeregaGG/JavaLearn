package animals;

import exceptions.WrongFoodException;
import food.Food;
import food.Meat;
import types.EnclosureType;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, EnclosureType enclosure_type) {
        super(name, enclosure_type);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Meat) {
            log.info(String.format("%s eating meat", this.name));
            this.satiety += food.getSatiety_score();
        } else {
            throw new WrongFoodException();
        }
    }
}
