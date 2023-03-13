import animals.Animal;
import animals.Dog;
import animals.HomeCat;
import animals.Tiger;
import cars.Car;
import game.ArmoredHero;
import game.Game;
import game.SimpleHero;
import game.Weapon;
import humans.Kia;

public class Main {

    public static void main(String[] args) {

//        humans.Student.amountOfChromosom = 46;
//
//        humans.Student student1 = new humans.Student("Ivan");
//
//        humans.Student student2 = new humans.Student("Vova");
//
//        humans.Student student3 = new humans.Student("Olesia");
//        student3.setAge(33);
//
//        System.out.println(humans.Student.amountOfChromosom);
//        System.out.println(student1.amountOfChromosom);
//        System.out.println(student2.amountOfChromosom);
//        System.out.println(student3.amountOfChromosom);

//        cars.Car car = new cars.Car();
//
//        System.out.println("car.isStarted() = " + car.isStarted());
//
//        car.setKeyId("111");
//
//        car.start("111");
//
//        System.out.println("car.isStarted() = " + car.isStarted());
        Weapon weapon1 = new Weapon(10, "Gun");
        Weapon weapon2 = new Weapon(7, "Machete");


        SimpleHero simpleHero = new SimpleHero(weapon1);
        simpleHero.setName("Simple Kotugoroshko");

        ArmoredHero armoredHero = new ArmoredHero(weapon2);
        armoredHero.setName("Armored Kozak");

        simpleHero.setOpponent(armoredHero);

        armoredHero.setOpponent(simpleHero);

        Game game = new Game(simpleHero, armoredHero);

        int whoWin = game.fight();
        System.out.println(whoWin + " - Opponent win");

    }

    public static void doSmth2() {
        Car car1 = new Car();
        car1.setKeyId("111");

        Car car2 = new Car();
        car2.setKeyId("111");

        Object car3 = new Car();
        Car car4 = (Car) car3;

        Kia kia = new Kia();
        kia.startKia("a");

        if (car3.equals(car4)) {
            System.out.println("car3 equals car4");
        }


        if (car1 == car2) {
            System.out.println("car1 == car2");
        } else {
            System.out.println("car1 != car2");
        }

        if (car1.equals(car2)) {
            System.out.println("car1.equals(car2)");
        } else {
            System.out.println("! car1.equals(car2)");
        }
    }

    public static void doSomth() {
        Tiger tiger = new Tiger();
        HomeCat homeCat = new HomeCat();
        homeCat.name = "рижий";
        Animal dog = new Dog();

        Animal[] animals = {tiger, homeCat, dog};

        tiger.say();

        homeCat.say();
        dog.say();

        tiger.hunt();

        tiger.sleep();
        dog.sleep();

        System.out.println(homeCat);

        tiger.purr();
        homeCat.purr();

        System.out.println();
        System.out.println();

        makeSay(animals);
    }

    public static void makeSay(Animal[] animals) {
        for (Animal animal : animals) {
            animal.say();
        }
    }
}