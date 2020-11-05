package org.example;

import lombok.Data;

@Data
public class Cell {

    private Status status;

    public Cell(Status status) {
        this.status = status;
    }

    public void generate(int livingNeighbours) {
        if (livingNeighbours < 2) {
            this.status = Status.DEAD;
        }else
            this.status = Status.ALIVE;
    }

    enum Status {
        DEAD, ALIVE
    }
}
