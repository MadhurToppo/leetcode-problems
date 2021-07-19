package com.madhurtoppo.ctci.commons.classes;

import com.madhurtoppo.ctci.treesandgraphs.Q401RouteBetweenNodes.Question;

public class Node {

    private String vertex;
    private int edgeCount;

    private Node[] edges;

    public Question.State state;

    public Node(String vertex, int edgeCount) {
        this.vertex = vertex;
        this.edgeCount = 0;
        edges = new Node[edgeCount];
    }

    public void addEdge(Node node) {
        if (edgeCount < edges.length) {
            this.edges[edgeCount] = node;
            edgeCount++;
        } else {
            System.out.print("No more edges can be added");
        }
    }

    public String getVertex() {
        return vertex;
    }

    public Node[] getEdges() {
        return edges;
    }

}
