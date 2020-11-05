package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.CellStatus.ALIVE;
import static org.example.CellStatus.DEAD;

class CellShould {

    private static final int ONE_LIVING_NEIGHBOUR = 1;
    private static final int TWO_LIVING_NEIGHBOURS = 2;
    private static final int THREE_LIVING_NEIGHBOURS = 3;

    @DisplayName("live cell with < 2 neighbours should die")
    @Test
    void underpopulationApplies() {
        assertThat(ALIVE.generate(ONE_LIVING_NEIGHBOUR)).isEqualTo(DEAD);
    }

    @DisplayName("live cell with 2 or 3 neighbours should keep alive ")
    @Test
    void keepAlive() {
        assertThat(ALIVE.generate(TWO_LIVING_NEIGHBOURS)).isEqualTo(ALIVE);
        assertThat(ALIVE.generate(THREE_LIVING_NEIGHBOURS)).isEqualTo(ALIVE);
    }
}