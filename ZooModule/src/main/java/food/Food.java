package food;

public abstract class Food {
    protected int satiety_score;
    public int getSatiety_score() {
        return satiety_score;
    }
    public Food(int satiety_score) {
        this.satiety_score = satiety_score;
    }
}
