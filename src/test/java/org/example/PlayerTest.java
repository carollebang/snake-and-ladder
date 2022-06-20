package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void testPlayerNameAndPosition() {
        Player actualPlayer = new Player("Name");
        assertEquals("Name", actualPlayer.getName());//checks if it gets the actual name
        assertEquals(0, actualPlayer.getPosition());//checks if the starting position is zero
    }
    @Test
    public void testPlayerPosition(){
        Player player = new Player("Name");
        assertEquals(0,player.getPosition());
        player.setPosition(20);
        assertEquals(20,player.getPosition());
        player.setPosition(2000);
        assertEquals(20,player.getPosition());
        player.setPosition(-1);
        assertEquals(20,player.getPosition());
        player.setPosition(35);
        assertEquals(35,player.getPosition());

    }
}

