package animals;

import types.EnclosureType;

public class Rabbit extends Herbivore implements Run {

    public Rabbit(String name, EnclosureType enclosure_type) {
        super(name, enclosure_type);
    }

    @Override
    public boolean run() {
        if (this.satiety <= 0) {
            return false;
        }
        System.out.printf("%s running\n", this.name);
        return true;
    }
}
