package com.madhurtoppo.slidingwindow.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] hash = new int[256];
        for (char c : p.toCharArray()) {
            hash[c]++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) {
            if (hash[s.charAt(right)] > 0) {
                count--;
            }
            hash[s.charAt(right)]--;
            right++;

            if (count == 0) {
                list.add(left);
            }

            if (right - left == p.length()) {
                if (hash[s.charAt(left)] >= 0) {
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }
        }

        return list;
    }
}
