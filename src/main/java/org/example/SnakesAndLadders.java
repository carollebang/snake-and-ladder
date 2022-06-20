package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakesAndLadders {

    private final  List<Movement> movements = new ArrayList<>();

    /**Generates a Snakes and Ladders map with random amount of snakes and ladders at random positions
     *
     */
    public SnakesAndLadders(){
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5)+5; i++){
            int snakePos1 = random.nextInt(100)+1;
            int snakePos2 = random.nextInt(100)+1;
            movements.add(new Snake(snakePos1,snakePos2));
        }
        for( int i = 0; i < random.nextInt(5)+5; i++){
            int ladderPos1 = random.nextInt(100)+1;
            int ladderPos2 = random.nextInt(100)+1;
            movements.add(new Ladder(ladderPos1,ladderPos2));
        }
    }

    /**
     *
     * @return a list of all snakes and ladders on this board
     */
    public List<Movement> getMovements() {
        return movements;
    }
}
