package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] array = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        helper(digits, "", result, array, 0);
        return result;
    }

    public void helper(String digits, String temp, List<String> result, String[] array, int index) {
        if (temp.length() == digits.length()) {
            result.add(temp);
            return;
        }
        String here = array[Integer.parseInt(String.valueOf(digits.charAt(index)))];
        for (int i = 0; i < here.length(); i++) {
            helper(digits, temp + here.charAt(i), result, array, index + 1);
        }
    }
}
