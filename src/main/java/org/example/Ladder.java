package org.example;


public class Ladder extends Movement {


    public Ladder(int position1, int position2) {
        super(Math.min(position1,position2), Math.max(position1,position2));
    }
}
