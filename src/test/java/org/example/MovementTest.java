package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovementTest {

    @Test
    public void testExit() {
        assertEquals(1, (new Movement(2, 1)).getExit());
    }


    @Test
    public void testAtEntrance() {
        assertTrue((new Movement(1, 21)).atEntrance(1));
    }

    @Test
    public void testMovement(){
        assertEquals(1,new Movement(21,1).getExit());
        assertEquals(21,new Movement(1,21).getExit());
    }
}

