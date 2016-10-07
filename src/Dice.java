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

import java.util.*;

/**
 * This class is a dice that returns a random value.
 * @version 1.0.0
 */
public class Dice {
    private Random rand;

    private static int faceCount;

    /**
     * When a Dice object gets constructed, the rand variable gets initialized. Nothing else happens.
     */
    public Dice() {
        rand = new Random();
    }

    /**
     * Returns a random integer from 1 to the selected amount of faces.
     * @return int
     */
    public int rollDice() {
        return rand.nextInt(faceCount) + 1;
    }

    /**
     * Sets the faceCount value to the wanted amount of faces for the die.
     * @param _faceCount sets the faceCount value.
     */
    public static void setFaceCount(int _faceCount) {
        faceCount = _faceCount;
    }

}