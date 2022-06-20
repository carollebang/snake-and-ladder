package org.example;


public class Player {
     private int position;
     private final String name;


    public Player( String name){
       this.name = name;
       this.position = 0;
    }

    /**
     *
     * @return the current position of this Player
     */
    public int getPosition() {
        return position;
    }

    /**
     *
     * @return the name of this Player
     */
    public String getName() {
        return name;
    }

    /** Changes the position of this Player if the supplied position is in the range 0-100
     *
     * @param position the position to set this Player to
     */
    public void setPosition(int position) {
        if (position <= 100 && position >= 0){
            this.position = position;
        }
    }
}
