package game;

public class Weapon {
    private final int damage;

    private final String weaponName;

    public Weapon(int damage, String weaponName) {
        this.damage = damage;
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
