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
 * This class is a die that returns a random value.
 * @version 1.0.1
 */
public class Die {
    private int    faceCount;

    private static Random rand;

    /**
     * When a Die object gets constructed, the rand variable gets initialized. Nothing else happens.
     * The default faceCount for a Die object is 6 faces.
     */
    public Die() {
        this.faceCount = 6;
        rand           = new Random();
    }

    public Die(int faceCount) {
        this.faceCount = faceCount;
        rand           = new Random();
    }

    /**
     * Returns a random integer from 1 to the selected amount of faces.
     * @return int
     */
    public int rollDie() {
        return rand.nextInt(faceCount) + 1;
    }

    /**
     * Sets the faceCount value to the wanted amount of faces for the die.
     * @param _faceCount sets the faceCount value.
     */
//    public static void setFaceCount(int _faceCount) {
//        faceCount = _faceCount;
//    }

}
