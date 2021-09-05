package com.madhurtoppo.dpandrecursion.leetcode.q17phone_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    private PhoneNumber phoneNumber;
    private List<String> actual;
    private List<String> expected;
    private String digits;

    @BeforeEach
    void setUp() {
        phoneNumber = new PhoneNumber();

    }

    @Test
    void letterCombinations() {
        digits = "23";
        actual = phoneNumber.letterCombinations(digits);
        expected = new ArrayList<>(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"));
        assertEquals(expected, actual);
    }
}