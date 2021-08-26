package com.madhurtoppo.leetcode.dpandrecursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return  result;
        }
        final String[] letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxxyz"};
        dfs(digits, letters, result, new StringBuilder(), 0);
        return result;
    }

    private void dfs(String digits, String[] letters, List<String> result, StringBuilder sb, int index) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        char ch = digits.charAt(index);
        String str = letters[Character.getNumericValue(ch)];

        for (char c : str.toCharArray()) {
            sb.append(c);
            dfs(digits, letters, result, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
