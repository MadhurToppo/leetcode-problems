package com.madhurtoppo.commons.classes;

import com.madhurtoppo.treesandgraphs.ctci.Q401RouteBetweenNodes.Question;

public class Node {

    private String vertex;
    private Node[] edges;
    private int edgeCount;

    public Question.State state;

    public Node(String vertex, int edgeCount) {
        this.vertex = vertex;
        this.edges = new Node[edgeCount];
        this.edgeCount = 0;
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
