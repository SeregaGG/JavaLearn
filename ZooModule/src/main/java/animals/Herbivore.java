package animals;

import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {
        try {
            if (food instanceof Grass) {
                log.info(String.format("%s eating grass", this.name));
                this.satiety += food.getSatiety_score();
            } else {
                throw new WrongFoodException();
            }
        } catch (WrongFoodException exception) {
            log.error(exception);
        }
    }
}
