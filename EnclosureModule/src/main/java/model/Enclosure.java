package model;

import animals.Animal;
import org.apache.log4j.Logger;
import types.EnclosureTypes;

import java.util.HashSet;

public class Enclosure <CustomType extends Animal> {
    private HashSet <CustomType> enclosure = new HashSet<>();
    private EnclosureTypes enclosure_type;
    private static final Logger log = Logger.getLogger(Enclosure.class);
    public Enclosure(EnclosureTypes enclosure_type) {
        this.enclosure_type = enclosure_type;
    }
    public boolean animalAdd(CustomType animal) {
        if (this.enclosure_type.getValue() >= animal.getEnclosure_type().getValue()){
            boolean is_added = this.enclosure.add(animal);
            if (is_added) {
                log.info(String.format("%s added.", animal.getName()));
                return true;
            } else {
                log.warn(String.format("%s already exists.", animal.getName()));
                return false;
            }
        }
        log.warn("Bad enclosure type.");
        return false;
    }

    public boolean animalRemove(CustomType animal) {
        log.info(String.format("%s removed.", animal.getName()));
        return this.enclosure.remove(animal);
    }

    public CustomType getAnimal(String name) {
        for (CustomType animal : this.enclosure) {
            if (animal.hashCode() == name.hashCode()) {
                log.info(String.format("%s exists.", animal.getName()));
                return animal;
            }
        }
        log.warn(String.format("%s doesn't exists.", name));
        return null;
    }
}
