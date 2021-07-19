package com.madhurtoppo.ctci.treesandgraphs.Q401RouteBetweenNodes;

import com.madhurtoppo.ctci.commons.classes.Graph;
import com.madhurtoppo.ctci.commons.classes.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    public static Graph graph;

    private static int nodeCount;
    private static boolean condition;

    @BeforeEach
    void setUp() {
        nodeCount = 6;
        graph = new Graph(nodeCount);

        Node[] nodes = new Node[6];

        nodes[0] = new Node("a", 3);
        nodes[1] = new Node("b", 0);
        nodes[2] = new Node("c", 0);
        nodes[3] = new Node("d", 1);
        nodes[4] = new Node("e", 1);
        nodes[5] = new Node("f", 0);

        nodes[0].addEdge(nodes[1]);
        nodes[0].addEdge(nodes[2]);
        nodes[0].addEdge(nodes[3]);
        nodes[3].addEdge(nodes[4]);
        nodes[4].addEdge(nodes[5]);

        for (int i = 0; i < 6; i++) {
            graph.addNode(nodes[i]);
        }
    }

    @Test
    void test1() {
        Node[] n = graph.getNodes();
        Node start = n[3];
        Node end = n[5];

        condition = Question.search(graph, start, end);
        assertTrue(condition);
    }

    @Test
    void test2() {
        Node[] n = graph.getNodes();
        Node start = n[2];
        Node end = n[3];

        condition = Question.search(graph, start, end);
        assertFalse(condition);
    }

    @Test
    void test3() {
        Node[] n = graph.getNodes();
        Node start = n[2];
        Node end = n[0];

        condition = Question.search(graph, start, end);
        assertFalse(condition);
    }
}