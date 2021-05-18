package com.madhurtoppo.leetcode.graph;

public class NumberOfIslands {
    private int n;
    private int m;

    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    sink(grid, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    private void sink(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        sink(grid, i+1, j);
        sink(grid, i-1, j);
        sink(grid, i, j+1);
        sink(grid, i, j-1);
    }

}
