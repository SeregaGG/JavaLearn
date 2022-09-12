package animals;

import exceptions.WrongFoodException;
import food.Food;
import types.EnclosureType;
import org.apache.log4j.Logger;

public abstract class Animal {

    protected int satiety = 10;

    protected String name;
    protected String VOICE_SOUND = "default";
    protected static final Logger log = Logger.getLogger(Animal.class);

    protected EnclosureType enclosure_type;

    public abstract void eat(Food food) throws WrongFoodException;

    public Animal(String name, EnclosureType enclosure_type) {
        this.name = name;
        this.enclosure_type = enclosure_type;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public String getName() {
        return name;
    }

    public EnclosureType getEnclosure_type() {
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
