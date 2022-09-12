package animals;

public class Hamster extends Herbivore implements Voice, Run {

    private static final String VOICE_SOUND = "Peep peep";

    public Hamster(String name) {
        this.name = name;
    }
    @Override
    public String voice() {
        return VOICE_SOUND;
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
