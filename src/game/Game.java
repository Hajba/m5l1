package game;

public class Game {

    private Hero opponent1;
    private Hero opponent2;

    public Game(Hero opponent1, Hero opponent2) {
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
    }

    public int fight() {
        boolean isSecondLoose = false;
        boolean isFirstLoose = false;

        while (!isSecondLoose && !isFirstLoose) {
            isSecondLoose= opponent1.damageOpponent();
            isFirstLoose = opponent2.damageOpponent();
        }
        return isSecondLoose ? 1 : 2;
    }
}
