/*
    ||======================================||
    ||    _         _     _  ___   ___      ||  Terningspil v1.0.0 | Java JDK 1.8.0_101
    ||   | |__   _ | | __| |/_  | /_  |     ||  Anders Wiberg Olsen        (s165241)
    ||   | '_ \ / \| |/ _  |  | |   | |     ||  Emil Johan Hoeg            (s152282)
    ||   | | | | O | | (_| | _| |_ _| |_    ||  Iman Chelhi                (s165228)
    ||   |_| |_|\_/|_|\__,_||_____|_____|   ||  Sebastian Tibor Bakonyvari (s145918)
    ||                                      ||  Troels Just Christoffersen (s150052)
    ||======================================||
 */

public class DieCup implements IDie{
    private Die[] dice;
    private static int dieCount;
    private static int faceCount;

    public DieCup() {
        this.dieCount = 2;
        this.faceCount = 6;
        initDice();
    }

    public DieCup(int dieCount) {
        this.dieCount  = dieCount;
        this.faceCount = 6;
        initDice();
    }

    public DieCup(int dieCount, int faceCount) {
        this.dieCount  = dieCount;
        this.faceCount = faceCount;
        initDice();
    }

    public DieCup(int dieCount, Die die) {
        this.dieCount = dieCount;

        initDice(die);
    }

    public DieCup(Die[] dice) {
        this.dieCount = dice.length;
        initDice(dice);
    }

    private void initDice() {
        for (int i = 0; i < dieCount; i++)
            this.dice[i] = new Die(faceCount);
    }

    private void initDice(Die die) {
        for (int i = 0; i < dieCount; i++)
            this. dice[i] = die;
    }

    private void initDice(Die[] dice) {
        for (int i = 0; i < dieCount; i++)
            this.dice[i] = dice[i];
    }

    public void roll() {

    }
}

