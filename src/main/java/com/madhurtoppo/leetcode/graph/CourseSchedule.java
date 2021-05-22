package com.madhurtoppo.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] req : prerequisites) {
            map.get(req[1]).add(req[0]);
        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!canFinish(i, visited, map)) {
                return false;
            }
        }
        return true;
    }

    private boolean canFinish(int i, int[] visited, HashMap<Integer, ArrayList<Integer>> map) {
        if (visited[i] == 1) {
            return false;
        }
        if (visited[i] == 2) {
            return true;
        }
        visited[i] = 1;
        for (int j : map.get(i)) {
            if (!canFinish(j, visited, map)) {
                return false;
            }
        }
        visited[i] = 2;
        return true;
    }
}
