package com.madhurtoppo.tccig.dpandrecursion.q802tower_of_hanoi;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private List<String> instructions = new ArrayList<>();

    public List<String> moveDisks(int n, char origin, char target, char intermediate) {

        if (n <= 0) {
            return instructions;
        }
        if (n == 1) {
            instructions.add("Disk 1 moved from " + origin + " to " + target);
            return instructions;
        }
        moveDisks(n - 1, origin, intermediate, target);
        instructions.add("Disk " + n + " moved from " + origin + " to " + target);
        moveDisks(n - 1, intermediate, target, origin);

        return instructions;
    }
}