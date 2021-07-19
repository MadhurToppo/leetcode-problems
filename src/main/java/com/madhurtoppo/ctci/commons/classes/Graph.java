package com.madhurtoppo.ctci.commons.classes;

public class Graph {

    private Node[] nodes;
    private int count;

    public Graph(int nodeCount) {
        this.nodes = new Node[nodeCount];
        this.count = 0;
    }

    public void addNode(Node node) {
        if (count < nodes.length) {
            nodes[count] = node;
            count++;
        } else {
            System.out.print("Graph full");
        }
    }

    public Node[] getNodes() {
        return nodes;
    }
}
