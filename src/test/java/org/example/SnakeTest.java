package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SnakeTest {

    @Test
    public void testSmallExitNum(){
        assertEquals(1, new Snake(1,21).getExit());
        assertEquals(1, new Snake(21, 1).getExit());
    }

    @Test
    public void testSnakeArgOrderDoesNotMatter(){
        assertEquals(new Snake(1,21), new Snake(21,1));

    }

}

