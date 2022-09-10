import model.Kotik;

public class Application {
    public static void main(String[] args){
        Kotik fitst_kotik = new Kotik(10, 10, "Neko", "Nya");
        fitst_kotik.liveAnotherDay();
        System.out.printf("Cat name - %s, cat weight - %s\n", fitst_kotik.getName(), fitst_kotik.getWeight());
        Kotik second_kotik = new Kotik();
        second_kotik.setKotik(15, 15, "Baksik", "Meow");
        System.out.printf("One and the same meow - %b\n", fitst_kotik.getMeow().equals(second_kotik.getMeow()));
        System.out.printf("Kotik count - %d\n", Kotik.getInstances_count());
    }
}
