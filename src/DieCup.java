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

/**
 * This class uses the Dice class to roll multiple die. It handles the wanted amount
 * of die in the project, and rolls them all.
 * @version 1.0.0
 */
public class DieCup {
    private Die[] dice;     // [] Because we have an Array of Dice objects

    private static int dieCount;

    /**
     * When the DiceCup gets constructed, an arrays gets initialized with the wanted amount of die. Therefore
     * it is important that the dieCount variable gets set first (with the setDieCount method).
     */
    public DieCup() {
        // We instantiate our Dice object array with the dieCount number of die
        dice = new Die[dieCount];

        // Every record in our Dice object array gets instantiated with a new Dice object
        for (int i = 0; i < dieCount; i++) {
            Die die = new Die();
            dice[i] = die;
        }
    }

    /**
     * Returns an array of all the rolled die. All values gets put in an array, and outputted.
     * @return array of int's
     */
    public int[] rollDice() {
        // We need an array of results, so every dice that gets rolled, gets analysed speerately in the GameLogic class
        int[] result = new int[dieCount];

        // Every dice gets rolled, and the value of the face, gets inserted in the result array
        for (int i = 0; i < dieCount; i++) {
            result[i] = dice[i].rollDie();
        }

        // The result gets returned
        return result;
    }

    /**
     * Sets the wanted amount of die in the project.
     * @param _dieCount wanted amount of die.
     */
    public static void setDieCount(int _dieCount) {
        dieCount = _dieCount;
    }

    /**
     * Returns the specified amount of die chosen in the project.
     * @return int
     */
    public static int getDieCount() {
        return dieCount;
    }
}