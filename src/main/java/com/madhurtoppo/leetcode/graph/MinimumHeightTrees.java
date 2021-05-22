package com.madhurtoppo.leetcode.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        if (n==1) {
            result.add(0);
            return result;
        }

        int[] degree = new int[n];
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (degree[i] == 0)
                return result;
            else if (degree[i] == 1) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            result = new ArrayList<>();
            int count = queue.size();

            for (int i = 0; i < count; i++) {
                int v = queue.poll();
                result.add(v);
                degree[v]--;

                for (int k = 0; k < adjList.get(v).size(); k++) {
                    int next = adjList.get(v).get(k);
                    if (degree[next] == 0) {
                        continue;
                    }
                    if (degree[next] == 2) {
                        queue.offer(next);
                    }
                    degree[next]--;
                }
            }
        }
        return result;
    }
}
