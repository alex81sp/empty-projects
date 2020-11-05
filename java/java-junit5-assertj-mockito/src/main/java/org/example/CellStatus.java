package org.example;

public enum CellStatus {
    ALIVE {
        @Override
        public CellStatus generate(int livingNeighbours) {
            return livingNeighbours == 2 || livingNeighbours == 3 ? ALIVE : DEAD;
        }
    },
    DEAD {
        @Override
        public CellStatus generate(int livingNeighbours) {
            return livingNeighbours == 3 ? ALIVE : DEAD;
        }
    };

    public abstract CellStatus generate(int livingNeighbours);

}
