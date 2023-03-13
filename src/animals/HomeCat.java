package animals;

public class HomeCat extends CatsFamily{

    public static void drink() {
        System.out.println("drinking water");
    }

    public String name;

    @Override
    public void say() {
        System.out.println("Home cat meeay");
    }

    @Override
    public String toString() {
        return "HomeCat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void purr() {
        System.out.println("low purr from home cat");
        drink();
    }
}
