package com.madhurtoppo.leetcode.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wbRecursive(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        return wbRecursive(s, set);
    }
    private boolean wbRecursive(String s, Set<String> set) {
        if (s.length() == 0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (set.contains(s.substring(0, i)) && wbRecursive(s.substring(i), set)) {
                return true;
            }
        }
        return false;
    }
}
