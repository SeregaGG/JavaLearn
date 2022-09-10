package animals;

import exceptions.WrongFoodException;
import food.Food;
import types.EnclosureTypes;
import org.apache.log4j.Logger;

public abstract class Animal {

    protected int satiety = 10;
    protected String name;
    protected static final Logger log = Logger.getLogger(Animal.class);
    private EnclosureTypes enclosure_type = EnclosureTypes.MEDIUM;
    public abstract void eat(Food food) throws WrongFoodException;

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public void setEnclosure_type(EnclosureTypes enclosure_type) {
        this.enclosure_type = enclosure_type;
    }

    public String getName() {
        return name;
    }

    public EnclosureTypes getEnclosure_type() {
        return enclosure_type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return this.name.equals(other.getName());
    }
}
