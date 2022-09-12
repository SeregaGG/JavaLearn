package model;

import animals.Animal;
import org.apache.log4j.Logger;
import types.EnclosureType;

import java.util.HashSet;

public class Enclosure <T extends Animal> {
    private HashSet <T> enclosure = new HashSet<>();

    private EnclosureType enclosure_type;

    private static final Logger log = Logger.getLogger(Enclosure.class);

    public Enclosure(EnclosureType enclosure_type) {
        this.enclosure_type = enclosure_type;
    }

    public boolean animalAdd(T animal) {

        if (this.enclosure_type.ordinal() < animal.getEnclosure_type().ordinal()) {
            log.warn("Bad enclosure type.");
            return false;
        }

        if (!this.enclosure.add(animal)) {
            log.warn(String.format("%s already exists.", animal.getName()));
            return false;
        }

        log.info(String.format("%s added.", animal.getName()));
        return true;
    }

    public boolean animalRemove(T animal) {
        log.info(String.format("%s removed.", animal.getName()));
        return this.enclosure.remove(animal);
    }

    public T getAnimal(String name) {
        for (T animal : this.enclosure) {
            if (animal.getName().equals(name)) {
                log.info(String.format("%s exists.", animal.getName()));
                return animal;
            }
        }
        log.warn(String.format("%s doesn't exists.", name));
        return null;
    }
}
