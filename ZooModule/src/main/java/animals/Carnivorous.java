package animals;

import exceptions.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {
        try {
            if (food instanceof Meat) {
                log.info(String.format("%s eating meat", this.name));
                this.satiety += food.getSatiety_score();
            } else {
                throw new WrongFoodException();
            }
        } catch (WrongFoodException exception) {
            log.error(exception);
        }
    }
}
