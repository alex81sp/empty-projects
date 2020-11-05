package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.CellStatus.ALIVE;
import static org.example.CellStatus.DEAD;

class CellShould {

    @DisplayName("alive cell with < 2 neighbours should die")
    @Test
    void underpopulationApplies() {
        final int livingNeighbours = 1;

        CellStatus actualStatus = ALIVE.generate(livingNeighbours);

        assertThat(actualStatus).isEqualTo(DEAD);
    }

    @DisplayName("alive cell with >= 2 neighbours should keep alive ")
    @Test
    void underpopulationNotApplies() {

        final int livingNeighbours = 2;
        CellStatus actualStatus = ALIVE.generate(livingNeighbours);

        assertThat(actualStatus).isEqualTo(ALIVE);
    }

}