package com.madhurtoppo.heapsandmaps.leetcode.q347top_k_frequent;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Question {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap();

        for (int num: nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> pq = new PriorityQueue<>((n1, n2) -> hm.get(n1) - hm.get(n2));

        for (int num : hm.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] top = new int[k];

        for (int i = 0; i < k; i++) {
            top[i] = pq.poll();
        }

        return top;
    }
}
