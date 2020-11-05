package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.CellStatus.ALIVE;
import static org.example.CellStatus.DEAD;

class CellShould {

    @Test
    void aliveCellShouldDieByUnderpopulation() {
        final int livingNeighbours = 1;

        CellStatus actualStatus = ALIVE.generate(livingNeighbours);

        assertThat(actualStatus).isEqualTo(DEAD);
    }

    @Test
    void aliveCellShouldKeepAliveByUnderpopulation() {

        final int livingNeighbours = 2;
        CellStatus actualStatus = ALIVE.generate(livingNeighbours);

        assertThat(actualStatus).isEqualTo(ALIVE);
    }

}