package org.example;

public enum CellStatus {
    ALIVE {
        @Override
        public CellStatus generate(int livingNeighbours) {
            if (livingNeighbours < 2) {
                return DEAD;
            } else
                return ALIVE;
        }
    },
    DEAD {
        @Override
        public CellStatus generate(int livingNeighbours) {
            return DEAD;
        }
    };

    public abstract CellStatus generate(int livingNeighbours);

}
