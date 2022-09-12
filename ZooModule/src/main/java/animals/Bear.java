package animals;

import types.EnclosureType;

public class Bear extends Carnivorous implements Voice, Run {
    public Bear(String name, EnclosureType enclosure_type) {
        super(name, enclosure_type);
        VOICE_SOUND = "Rrrrrr";
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
