package org.example;

public enum CellStatus {

    ALIVE, DEAD;

    public CellStatus generate(int livingNeighbours) {
        if (livingNeighbours < 2) {
            return DEAD;
        } else
            return ALIVE;
    }

}
