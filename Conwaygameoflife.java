package Labs.Lab06;

public class Conwaygameoflife {

    public static boolean[][] update(boolean[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] nextGrid = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = countLiveNeighbors(grid, i, j);

                if (grid[i][j]) { // Cell is alive
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        nextGrid[i][j] = false; // Dies
                    } else {
                        nextGrid[i][j] = true;  // Lives
                    }
                } else { // Cell is dead
                    if (liveNeighbors == 3) {
                        nextGrid[i][j] = true;  // Becomes alive
                    } else {
                        nextGrid[i][j] = false; // Remains dead
                    }
                }
            }
        }

        return nextGrid;
    }

    private static int countLiveNeighbors(boolean[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Skip the cell itself

                int neighborRow = Math.floorMod(row + i, rows); // Wraps around rows
                int neighborCol = Math.floorMod(col + j, cols); // Wraps around cols

                if (grid[neighborRow][neighborCol]) {
                    count++;
                }
            }
        }

        return count;
    }
}