package animals;

public class Fish extends Herbivore implements Swim {

    public Fish(String name) {
        this.name = name;
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
