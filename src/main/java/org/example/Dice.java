package org.example;

import java.util.Random;

public class Dice {

    private final Random random;

    /**A single die with in built random number generation
     */
    public Dice(){
        this(new Random());
    }

    /**A single die using the parsed random number generator
     * @param random the random number generator to use for rolling
     */
    public Dice(Random random){
        this.random = random;
    }

    /** Rolls a random number between 1 and 6
     * @return a random number between 1 and 6 inclusive
     */
    public int roll(){
        return random.nextInt(6)+1;
    }
}
