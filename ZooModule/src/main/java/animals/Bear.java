package animals;

public class Bear extends Carnivorous implements Voice, Run {

    private static final String VOICE_SOUND = "Rrrrrr";

    public Bear(String name) {
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
