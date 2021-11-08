package com.madhurtoppo.heapsandmaps.leetcode.q215kth_largest;

import java.util.PriorityQueue;

public class Question {
    public int findKthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
