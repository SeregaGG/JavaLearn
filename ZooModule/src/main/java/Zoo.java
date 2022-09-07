import animals.Bear;
import animals.Duck;
import animals.Fish;
import animals.Swim;
import food.Grass;
import food.Meat;
import services.Worker;

public class Zoo {
    public static void main(String[] args){
        Worker bad_worker = new Worker("Bad worker", 80);
        Worker good_worker = new Worker("Good worker", 80);

        Bear bear = new Bear("VinniPuh");
        Duck duck = new Duck("Utka");
        Fish fish = new Fish("Riba");

        Meat meat = new Meat(50);
        Grass grass = new Grass(10);

        bad_worker.getVoice(bear);
        bad_worker.getVoice(duck);
        //bad_worker.getVoice(fish);

        bear.run();
        good_worker.feed(bear, bad_worker);
        good_worker.feed(bear, meat);
        good_worker.feed(bear, grass);

        duck.fly();
        duck.swim();
        good_worker.feed(duck, meat);
        good_worker.feed(duck, grass);

        good_worker.feed(fish, meat);
        good_worker.feed(fish, grass);

        Swim[] pool = {duck, fish, new Duck("SecondUtka"), new Fish("SecondRiba")};
        for (Swim swimmable_animal : pool) {
            swimmable_animal.swim();
        }


    }
}
