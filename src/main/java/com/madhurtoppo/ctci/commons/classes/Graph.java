package com.madhurtoppo.ctci.commons.classes;

public class Graph {

    private Node[] edges;
    private int count;

    public Graph(int nodeCount) {
        edges = new Node[nodeCount];
        count = 0;
    }

    public void addNode(Node node) {
        if (count < edges.length) {
            edges[count] = node;
            count++;
        } else {
            System.out.print("Graph full");
        }
    }

    public Node[] getNodes() {
        return edges;
    }
}
