package com.madhurtoppo.slidingwindow.leetcode;

import java.util.HashSet;

/***
 * Longest Substring Without Repeating Characters
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max= 0;
        int start = 0;
        int end = 0;

        HashSet<Character> set = new HashSet<>();

        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
