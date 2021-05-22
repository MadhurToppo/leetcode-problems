package com.madhurtoppo.leetcode.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ConnectedComponents {
    public int countComponents(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new LinkedList<Integer>());
        }

        for (int i = 0; i < edges.length; i++) {
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(map, i, visited);
            }
        }
        return count;
    }

    private void dfs(HashMap<Integer, List<Integer>> adj, int index, boolean[] visited) {
        visited[index] = true;

        for (Integer j : adj.get(index)) {
            if (!visited[j]) {
                dfs(adj, j, visited);
            }
        }
    }
}
