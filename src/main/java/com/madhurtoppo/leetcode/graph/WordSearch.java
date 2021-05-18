package com.madhurtoppo.leetcode.graph;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        boolean[][] visited;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                visited = new boolean[board.length][board[i].length];
                if (exist(chars, board, visited, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[] chars, char[][] board, boolean[][] visited, int i, int j, int index) {
        if (index == chars.length) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] != chars[index] || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        boolean exist = exist(chars, board, visited, i+1, j, index+1) ||
                exist(chars, board, visited, i-1, j, index+1) ||
                exist(chars, board, visited, i, j+1, index+1) ||
                exist(chars, board, visited, i, j-1, index+1);

        visited[i][j] = false;
        return exist;
    }
}
