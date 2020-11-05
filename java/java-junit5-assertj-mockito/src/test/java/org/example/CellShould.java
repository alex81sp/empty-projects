package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CellShould {

    @Test
    void beAliveWhenInitialStateAlive() {
        final Cell givenAliveCell = new Cell(Cell.Status.ALIVE);
        final boolean alive = true;

        assertThat(givenAliveCell.isAlive()).isEqualTo(alive);
    }

    @Test
    void beNotAliveWhenInitialStateDead() {
        final Cell givenDeadCell = new Cell(Cell.Status.DEAD);
        final boolean notAlive = false;

        assertThat(givenDeadCell.isAlive()).isEqualTo(notAlive);
    }

}