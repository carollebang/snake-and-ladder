package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LadderTest {

    @Test
    public void testLadderMovement(){
        assertEquals(21, new Ladder(21,1).getExit());
        assertNotEquals(1,new Ladder(1,21).getExit());
    }
    @Test
    public void testEntrance(){
        assertTrue(new Ladder(1,21).atEntrance(1));
        assertFalse(new Ladder(21,1).atEntrance(21));
    }

    @Test
    public void testLadderArgsOrderDoesNotMatter(){
        assertEquals(new Ladder(1,20),new Ladder(20,1));
    }
}
