import model.Kotik;

public class Application {
    public static void main(String[] args){
        Kotik test_kotik = new Kotik(10, 10, "Cat", "Nya");
        System.out.println(test_kotik.prettiness);
    }
}
