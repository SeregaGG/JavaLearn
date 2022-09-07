package model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int satiety = 3;

    private static int instances_count;
    public Kotik() {
        instances_count++;
    }
    public void setKotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }
    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        instances_count++;
    }

    private boolean isSatiety() {
        return this.satiety > 0;
    }
    private boolean sayMeow() {

        if (!this.isSatiety()) {
            return false;
        }

        System.out.printf("%s say %s\n", this.name, this.meow);
        this.satiety--;
        return true;
    }

    public void liveAnotherDay() {
        int methods_count = 6;
        int action_count = 24;
        for (int i = 0; i < action_count; i++) {
            switch ((int) (Math.random() * methods_count) + 1) {
                case 1 -> {
                    boolean is_meowing = this.sayMeow();
                    if (!is_meowing) {
                        this.eat(5);
                    }
                }
                case 2 -> {
                    boolean is_plaing = this.play();
                    if (!is_plaing) {
                        this.eat(5, "Some food");
                    }
                }
                case 3 -> {
                    boolean is_pretty = this.bePretty();
                    if (!is_pretty) {
                        this.eat(25, "BigFood");
                    }
                }
                case 4 -> {
                    boolean is_chasing = this.chaseMouse();
                    if (!is_chasing) {
                        this.eat(15, "mouse");
                    }
                }
                case 5 -> {
                    boolean is_sleeping = this.sleep();
                    if (!is_sleeping) {
                        this.eat(10);
                    }
                }
                case 6 -> {
                    boolean is_purring = this.purr();
                    if (!is_purring) {
                        this.eat();
                    }
                }
            }
        }
    }

    private boolean play() {

        if (!this.isSatiety()) {
            return false;
        }

        System.out.printf("%s playing\n", this.name);
        this.satiety--;
        return true;
    }

    private boolean sleep() {

        if (!this.isSatiety()) {
            return false;
        }

        System.out.printf("%s sleeping\n", this.name);
        this.satiety--;
        return true;
    }

    private boolean chaseMouse() {

        if (!this.isSatiety()) {
            return false;
        }

        System.out.printf("%s chasing mouse\n", this.name);
        this.satiety--;
        return true;
    }

    private boolean purr() {

        if (!this.isSatiety()) {
            return false;
        }

        System.out.printf("%s purring\n", this.name);
        this.satiety--;
        return true;
    }

    private boolean bePretty() {

        if (!this.isSatiety()) {
            return false;
        }

        System.out.printf("%s behaves prettily\n", this.name);
        this.satiety--;
        return true;
    }

    private void eat(int satiety_score) {
        this.satiety += satiety_score;
        System.out.printf("%s eating\n", this.name);
    }
    private void eat(int satiety_score, String food) {
        this.satiety += satiety_score;
        System.out.printf("%s eating %s\n", this.name, food);
    }
    private void eat() {
        eat(10, "Default");
    }

    public static int getInstances_count() {
        return instances_count;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public String getName() {
        return name;
    }
}
