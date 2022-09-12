package animals;

import types.EnclosureType;

public class Hamster extends Herbivore implements Voice, Run {
    public Hamster(String name, EnclosureType enclosure_type) {
        super(name, enclosure_type);
        VOICE_SOUND = "Peep peep";
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
