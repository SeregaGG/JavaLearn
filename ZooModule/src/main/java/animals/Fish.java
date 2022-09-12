package animals;

import types.EnclosureType;

public class Fish extends Herbivore implements Swim {

    public Fish(String name, EnclosureType enclosure_type) {
        super(name, enclosure_type);
    }

    @Override
    public boolean swim() {
        if (this.satiety <= 0) {
            return false;
        }
        System.out.printf("%s swimming\n", this.name);
        return true;
    }
}
