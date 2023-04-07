import java.util.*;
import java.math.BigInteger;

public class leetcode200 {

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    helper(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void helper(char[][] grid, int i, int j) {
        // base case
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        // removing that iceland
        grid[i][j] = '0';
        helper(grid, i - 1, j);// up
        helper(grid, i + 1, j);// down
        helper(grid, i, j - 1);// left
        helper(grid, i, j + 1);// right
    }

    public static void main(String[] args) {

        char[][] grid = { { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }, };

        System.out.println(numIslands(grid));
    }
}
