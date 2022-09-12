import animals.Bear;
import animals.Carnivorous;
import animals.Hamster;
import animals.Herbivore;
import model.Enclosure;
import types.EnclosureType;

public class Application {
    public static void main(String[] args) {
        Enclosure <Herbivore> herbivores = new Enclosure<>(EnclosureType.SMALL);
        Enclosure <Carnivorous> carnivorous = new Enclosure<>(EnclosureType.LARGE);

        Hamster hamster = new Hamster("Homyak", EnclosureType.SMALL);
        Hamster large_hamster = new Hamster("Bear", EnclosureType.LARGE);

        herbivores.animalAdd(hamster);
        herbivores.animalAdd(large_hamster);

        Bear small_bear = new Bear("Hamster", EnclosureType.SMALL);
        Bear bear = new Bear("Puh", EnclosureType.LARGE);
        carnivorous.animalAdd(bear);
        carnivorous.animalAdd(small_bear);
        carnivorous.animalAdd(small_bear);

        carnivorous.getAnimal("RandomName");
        carnivorous.getAnimal("Puh");
        carnivorous.animalRemove(bear);
        carnivorous.getAnimal("Puh");

    }
}
