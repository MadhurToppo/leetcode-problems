package com.madhurtoppo.tccig.dpandrecursion.q804color_spots;

public class Question {

    private int current;

    public String findLargestColorSpot(int cols, int rows, int a[][]) {
        StringBuilder sb = new StringBuilder();

        int color = 0;
        int max = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (a[i][j] > 0) {

                    current = 0;
                    count(i, j, cols, rows, a, a[i][j]);

                    if (current > max) {
                        max = current;
                        color = a[i][j] * (-1);
                    }
                }
            }
        }
        sb.append("Color: ").append(color).append(", Biggest Spot: ").append(max);
        return sb.toString();
    }

    private void count(int i, int j, int cols, int rows, int a[][], int color) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || a[i][j] != color) {
            return;
        }

        a[i][j] = -a[i][j];
        current++;

        if (i > 1 && a[i - 1][j] == color) {
            count(i - 1, j, cols, rows, a, color);
        }
        if ((i + 1) < rows && a[i + 1][j] == color) {
            count(i + 1, j, cols, rows, a, color);
        }
        if (j > 1 && a[i][j - 1] == color) {
            count(i, j - 1, cols, rows, a, color);
        }
        if ((j + 1) < cols && a[i][j + 1] == color) {
            count(i, j + 1, cols, rows, a, color);
        }
    }
}