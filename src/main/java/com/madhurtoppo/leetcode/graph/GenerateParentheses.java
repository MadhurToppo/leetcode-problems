package com.madhurtoppo.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(new StringBuilder(), result, 0, 0, n);
        return result;
    }

    private void dfs(StringBuilder sb, List<String> result, int open, int close, int n) {
        if (sb.length() == n * 2) {
            result.add(sb.toString());
            return;
        }
        if (open < n) {
            sb.append("(");
            dfs(sb, result, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            dfs(sb, result, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}