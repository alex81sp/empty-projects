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
    private static final int FOUR_LIVING_NEIGHBOURS = 4;

    @DisplayName("live cell with < 2 neighbours should die")
    @Test
    void lessThanTwoDies() {
        assertThat(ALIVE.generate(ONE_LIVING_NEIGHBOUR)).isEqualTo(DEAD);
    }

    @DisplayName("live cell with 2 or 3 neighbours should keep alive ")
    @Test
    void keepAliveWithTwoOrThree() {
        assertThat(ALIVE.generate(TWO_LIVING_NEIGHBOURS)).isEqualTo(ALIVE);
        assertThat(ALIVE.generate(THREE_LIVING_NEIGHBOURS)).isEqualTo(ALIVE);
    }

    @DisplayName("live cell with more than three should die")
    @Test
    void dieWithMoreThanThree(){
        assertThat(ALIVE.generate(FOUR_LIVING_NEIGHBOURS)).isEqualTo(DEAD);
    }

    @DisplayName("dead cell with == 3 live neighbours becomes a live cell, as if by reproduction")
    @Test
    void deadCellWithThreeLives(){
        assertThat(DEAD.generate(THREE_LIVING_NEIGHBOURS)).isEqualTo(ALIVE);
    }

    @DisplayName("dead cell with != 3 live neighbours becomes a live cell, as if by reproduction")
    @Test
    void deadCellWithNotThreeLives(){
        assertThat(DEAD.generate(TWO_LIVING_NEIGHBOURS)).isEqualTo(DEAD);
        assertThat(DEAD.generate(FOUR_LIVING_NEIGHBOURS)).isEqualTo(DEAD);
    }

}