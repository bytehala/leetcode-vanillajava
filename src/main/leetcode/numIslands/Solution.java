package leetcode.numIslands;

import java.util.Arrays;

public class Solution {

    static char[][] grid;

    public int numIslands(char[][] gridOrig) {
        if (gridOrig == null || gridOrig.length == 0)
            return 0;

        grid = gridOrig.clone();

        int islands = 0;
        for(int y = 0; y < grid.length; y++)
            for(int x = 0; x < grid[0].length; x++) {
                if(grid[y][x] == 1) {
                    islands++;
                    sinkIsland(y, x);
                }
            }

        return islands;
    }

    private static void sinkIsland(int y, int x) {
        grid[y][x] = 0;
        if (y + 1 < grid.length && grid[y+1][x] == 1) {
            sinkIsland(y + 1, x);
        }
        if (x + 1 < grid[0].length && grid[y][x+1] == 1) {
            sinkIsland(y, x + 1);
        }
    }

    private static void printGrid() {
        for(int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++)
                System.out.print("" + ('0' + grid[y][x] - 48));
            System.out.println();
        }

    }

}
