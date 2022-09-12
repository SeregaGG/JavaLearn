package animals;

public class Lion extends Carnivorous implements Voice, Run {
    public Lion(String name) {
        VOICE_SOUND = "Rrrrrr";
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
