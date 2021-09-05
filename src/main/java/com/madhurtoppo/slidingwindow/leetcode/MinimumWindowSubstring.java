package com.madhurtoppo.slidingwindow.leetcode;

public class MinimumWindowSubstring {
    public String minWindow(String S, String T) {
        int i = 0;
        int j = 0;

        int[] tHash = new int[256];
        int[] sHash = new int[256];
        for (int k = 0; k < T.length(); k++) {
            tHash[T.charAt(k)]++;
        }

        int found = 0;
        int length = Integer.MAX_VALUE;
        String result = "";

        while (j < S.length()){
            if (found < T.length()) {
                if (tHash[S.charAt(j)] > 0) {
                    sHash[S.charAt(j)]++;
                    if (sHash[S.charAt(j)] <= tHash[S.charAt(j)]){
                        found++;
                    }
                }
                j++;
            }

            while (found == T.length()) {
                if (j - i < length) {
                    length = j - i;
                    result = S.substring(i, j);
                }
                if (tHash[S.charAt(i)] > 0) {
                    sHash[S.charAt(i)]--;
                    if (sHash[S.charAt(i)] < tHash[S.charAt(i)]) {
                        found--;
                    }
                }
                i++;
            }
        }
        return result;
    }
}
