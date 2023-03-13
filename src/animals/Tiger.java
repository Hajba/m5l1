package animals;

public class Tiger extends CatsFamily{

    @Override
    public void say() {
        System.out.println("Tiger arrrrr");
    }

    public void hunt() {
        System.out.println("Tiger hunting");
    }

    @Override
    public void purr() {
        System.out.println("Loud purr from Tiger");
    }
}
