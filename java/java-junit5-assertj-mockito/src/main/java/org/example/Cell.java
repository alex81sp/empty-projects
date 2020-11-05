package org.example;

import lombok.Data;

@Data
public class Cell {

    private Status status;

    public Cell(Status status) {
        this.status = status;
    }

    public void generate(int livingNeighbours) {
        this.status = Status.DEAD;
    }

    enum Status {
        DEAD, ALIVE
    }
}
