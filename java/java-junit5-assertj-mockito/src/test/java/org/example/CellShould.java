package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.example.Cell.Status.*;

class CellShould {

    @Test
    void beAliveWhenInitialStateAlive() {
        final Cell givenAliveCell = new Cell(ALIVE);

        assertThat(givenAliveCell.getStatus()).isEqualTo(ALIVE);
    }

    @Test
    void beNotAliveWhenInitialStateDead() {
        final Cell givenDeadCell = new Cell(DEAD);

        assertThat(givenDeadCell.getStatus()).isEqualTo(DEAD);
    }

    @Test
    void aliveCellShouldDieByUnderpopulation() {
        final Cell givenAliveCell = new Cell(ALIVE);

        final int livingNeighbours = 1;
        givenAliveCell.generate(livingNeighbours);

        assertThat(givenAliveCell.getStatus()).isEqualTo(DEAD);
    }

}