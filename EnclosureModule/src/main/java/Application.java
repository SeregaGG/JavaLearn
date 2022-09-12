import animals.Bear;
import animals.Carnivorous;
import animals.Hamster;
import animals.Herbivore;
import model.Enclosure;
import types.EnclosureTypes;

public class Application {
    public static void main(String[] args) {
        Enclosure <Herbivore> herbivores = new Enclosure<>(EnclosureTypes.SMALL);
        Enclosure <Carnivorous> carnivorous = new Enclosure<>(EnclosureTypes.LARGE);

        Hamster hamster = new Hamster("Homyak");
        Hamster large_hamster = new Hamster("Bear");

        large_hamster.setEnclosure_type(EnclosureTypes.LARGE);
        hamster.setEnclosure_type(EnclosureTypes.SMALL);

        herbivores.animalAdd(hamster);
        herbivores.animalAdd(large_hamster);

        Bear small_bear = new Bear("Hamster");
        Bear bear = new Bear("Puh");

        small_bear.setEnclosure_type(EnclosureTypes.SMALL);
        bear.setEnclosure_type(EnclosureTypes.LARGE);
        carnivorous.animalAdd(bear);
        carnivorous.animalAdd(small_bear);
        carnivorous.animalAdd(small_bear);

        carnivorous.getAnimal("RandomName");
        carnivorous.getAnimal("Puh");
        carnivorous.animalRemove(bear);
        carnivorous.getAnimal("Puh");

    }
}
