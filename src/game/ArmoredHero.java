package game;

public class ArmoredHero extends Hero {

    private int damageCoeficient;

    public ArmoredHero(Weapon weapon) {
        super(65, weapon);
        this.damageCoeficient = 2;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage / damageCoeficient);
    }
}
