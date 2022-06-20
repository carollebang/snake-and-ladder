package org.example;
public class Snake extends Movement{
    public Snake(int position1, int position2) {
        super(Math.max(position1, position2), Math.min(position1,position2));
    }
}
