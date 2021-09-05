package com.madhurtoppo.treesandgraphs.ctci.Q407TopologicalSort;

import java.util.*;

public class CourseSchedule {
    private Stack<Integer> stack;
    private boolean[] visited;
    private boolean[] temp;
    private Map<Integer, List<Integer>> graph;

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        stack = new Stack<>();
        visited = new boolean[numCourses];
        temp = new boolean[numCourses];
        graph = new HashMap<>();
        int[] courseOrder = new int[numCourses];

        //1. Build Graph
        for (int i = 0; i < visited.length; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] pair : prerequisites) {
            int source = pair[0];
            int destination = pair[1];
            graph.get(source).add(destination);
        }

        //2. Detect Cycle
        boolean cycle = false;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                cycle = dfs(i);
                if (cycle) {
                    break;
                }
            }
        }
        if (cycle) {
            return new int[]{};
        }

        //3. Perform Topological Sort
        Arrays.fill(visited, false);
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                visited[i] = true;
                topologicalSort(i);
            }
        }

        //4. Build Course Order
        int k = numCourses - 1;
        while (!stack.isEmpty()) {
            courseOrder[k] = stack.pop();
            k--;
        }
        return courseOrder;
    }

    private boolean dfs(int current) {
        visited[current] = true;
        temp[current] = true;

        for (int child : graph.get(current)) {
            if (temp[child]) {
                return true;
            }
            if (!visited[child]) {
                if (dfs(child)) {
                    return true;
                }
            }
        }
        temp[current] = false;
        return false;
    }

    private void topologicalSort(int current) {
        for (int child : graph.get(current)) {
            if (!visited[child]) {
                visited[child] = true;
                topologicalSort(child);
            }
        }
        stack.push(current);
    }
}
