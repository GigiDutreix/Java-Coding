package Labs.Lab06;

public class ConwayGameOfLifeTester {

    public static void main(String[] args) {
        boolean[][] grid = {
                {true, false, false},
                {false, true, true},
                {false, true, true}
        };

        boolean[][] nextGrid = ConwayGameOfLife.update(grid);

        // Output the next generation grid
        for (int i = 0; i < nextGrid.length; i++) {
            for (int j = 0; j < nextGrid[0].length; j++) {
                System.out.print(nextGrid[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }

    }
}