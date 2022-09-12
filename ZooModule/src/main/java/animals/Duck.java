package animals;

public class Duck extends Carnivorous implements Fly, Voice, Swim {
    public Duck(String name) {
        VOICE_SOUND = "krya krya";
        this.name = name;
    }

    @Override
    public boolean fly() {
        if (this.satiety <= 0) {
            return false;
        }
        System.out.printf("%s flying\n", this.name);
        return true;
    }

    @Override
    public String voice() {
        return VOICE_SOUND;
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
