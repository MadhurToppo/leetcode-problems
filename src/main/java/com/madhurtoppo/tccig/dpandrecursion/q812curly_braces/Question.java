package com.madhurtoppo.tccig.dpandrecursion.q812curly_braces;

import java.util.ArrayList;
import java.util.List;

public class Question {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(n, sb, result, 0, 0);
        return result;
    }

    private void dfs(int n, StringBuilder sb, List<String> result, int open, int close) {
        if (sb.length() == n * 2) {
            result.add(sb.toString());
            return;
        }
        if (open < n) {
            sb.append("(");
            dfs(n, sb, result, open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            dfs(n, sb, result, open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
