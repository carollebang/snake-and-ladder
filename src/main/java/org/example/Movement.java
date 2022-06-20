package org.example;

import java.util.Objects;

public class Movement {
    private final int entrance;
    private final int exit;

    /** A movement object with specified entrance and exit positions
     * @param entrance the entrance position of this Movement
     * @param exit the exit position of this Movement
     */
    public Movement(int entrance, int exit){
        this.entrance = entrance;
        this.exit = exit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movement movement = (Movement) o;
        return entrance == movement.entrance && exit == movement.exit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(entrance, exit);
    }

    /** Checks whether the parsed position is the entrance of this Movement object
     * @param position the position to check
     * @return true if the entrance else false
     */
    public boolean atEntrance(int position){
        return position == entrance;
    }

    /**
     * @return the exit position of this Movement object
     */
    public int getExit() {
        return exit;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " (Entrance: " + entrance +
                " Exit: " + exit+")";
    }
}
