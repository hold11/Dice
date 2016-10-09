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
 * @version 1.0.2
 */
public class Die implements IDie {
    private int faceCount;
    private int result;

    private static Random rand;

    /**
     * When a Die object gets constructed, the rand variable gets initialized. Nothing else happens.
     * The default faceCount for a Die object is 6 faces.
     */
    public Die() {
        this.faceCount = 6;
        result         = 0;
        rand           = new Random();
    }

    public Die(int faceCount) {
        this.faceCount = faceCount;
        result         = 0;
        rand           = new Random();
    }

    /**
     * Rolls the die, and returns the value of the face.
     * @return int
     */
    public int getRolledDieResult() {
        roll();
        return getDieResult();
    }

    /**
     * Gets the result of the rolled die.
     * @return int
     */
    public int getDieResult() {
        return this.result;
    }


    /**
     * Sets the result variable of the die to a random face of the die.
     */
    public void roll() {
        this.result = rand.nextInt(faceCount) + 1;
    }

    /**
     * Sets the faceCount value to the wanted amount of faces for the die.
     * @param faceCount sets the faceCount value.
     */
    public void setFaceCount(int faceCount) {
        this.faceCount = faceCount;
    }

    /**
     * Gets the faceCount value of the die.
     * @return int
     */
    public int getFaceCount() { return this.faceCount; }
}
