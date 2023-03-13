package game;

public abstract class Hero {

    private String name;

    private Hero opponent;

    private int healsPoints;

    private boolean isDead;

    private Weapon weapon;

    public Hero(int healsPoints, Weapon weapon) {
        this.healsPoints = healsPoints;
        this.weapon = weapon;
        this.isDead = false;
    }

    public void receiveDamage(int damage) {
        healsPoints -= damage;
        if (healsPoints <= 0) {
            healsPoints = 0;
            isDead = true;
        }
    }

    public boolean damageOpponent() {
        System.out.println(" opponent \"" + this.name + "\" damage opponent \"" + opponent.getName() + "\" for " + weapon.getDamage() + " damage");
        System.out.println(this.name + " health = " + healsPoints + " || " + opponent.getName() + " health = " + opponent.getHealsPoints());
        opponent.receiveDamage(this.weapon.getDamage());
        return opponent.isDead();
    }

    public boolean isDead() {
        return isDead;
    }

    public Hero getOpponent() {
        return opponent;
    }

    public void setOpponent(Hero opponent) {
        this.opponent = opponent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        if (this.weapon == null) {
            this.weapon = weapon;
        }
    }

    public int getHealsPoints() {
        return healsPoints;
    }
}
