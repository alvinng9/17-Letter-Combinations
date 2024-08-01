package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void letterCombinationsTest() {
        Solution solution = new Solution();
        List<String> output = new ArrayList<>(
                Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"));
        assertEquals(output, solution.letterCombinations("23"));
        output = new ArrayList<>();
        assertEquals(output, solution.letterCombinations(""));
        output = new ArrayList<>(
                Arrays.asList("a","b","c"));
        assertEquals(output, solution.letterCombinations("2"));

    }

}