package animals;

public class Rabbit extends Herbivore implements Run {

    public Rabbit(String name) {
        this.name = name;
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
