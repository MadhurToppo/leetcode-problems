package com.madhurtoppo.dpandrecursion.tccig.q810string_permutations;

import com.madhurtoppo.dpandrecursion.tccig.q810string_permutations.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private String str;
    private List<String> expected;
    private List<String> actual;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        str = "ABC";
        expected = new ArrayList<>();
        expected.add("ABC");
        expected.add("ACB");
        expected.add("BAC");
        expected.add("BCA");
        expected.add("CAB");
        expected.add("CBA");
        actual = question.permute(str);

        assertEquals(expected, actual);
    }
}