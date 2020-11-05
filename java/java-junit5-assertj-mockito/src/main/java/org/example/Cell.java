package org.example;

public class Cell {

    private final Status status;

    public Cell(Status status) {
        this.status = status;
    }

    public boolean isAlive() {
        return status == Status.ALIVE;
    }

    enum Status {
        DEAD, ALIVE
    }
}
