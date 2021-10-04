package com.madhurtoppo.dpandrecursion.leetcode.q17phone_number;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        final String[] alphabets = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        dfs(digits, alphabets, result, new StringBuilder(), 0);
        return result;
    }

    private void dfs(String digits, String[] alphabets, List<String> result, StringBuilder sb, int i) {
        if (i == digits.length()) {
            result.add(sb.toString());
            return;
        }
        char digit = digits.charAt(i);
        String letters = alphabets[Character.getNumericValue(digit)];

        for (char ch : letters.toCharArray()) {
            sb.append(ch);
            dfs(digits, alphabets, result, sb, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
