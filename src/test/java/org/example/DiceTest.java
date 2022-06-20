package org.example;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiceTest {

    @Test
    public void testDiceInsertRandom() {
        class bla extends Random {
            @Override
            public int nextInt(int bound) {
                return 1;
            }
        }
        Dice dice = new Dice(new bla());
        for (int i = 0; i < 100; i++) {
            assertEquals(2, dice.roll());
        }
    }








    @Test
    public void testRollInRange1To6() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            assertTrue(dice.roll() > 0);
            assertTrue(dice.roll() < 7);
        }
    }
}