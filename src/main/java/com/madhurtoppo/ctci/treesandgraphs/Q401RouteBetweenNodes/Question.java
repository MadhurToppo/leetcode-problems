package com.madhurtoppo.ctci.treesandgraphs.Q401RouteBetweenNodes;

import com.madhurtoppo.ctci.commons.classes.Graph;
import com.madhurtoppo.ctci.commons.classes.Node;

import java.util.LinkedList;

public class Question {

    public enum State {
        Unvisited, Visited, Visiting;
    }

    public static boolean search(Graph graph,Node start,Node end) {
        LinkedList<Node> q = new LinkedList<>();
        for (Node node : graph.getNodes()) {
            node.state = State.Unvisited;
        }
        start.state = State.Visiting;
        q.add(start);
        Node u;
        while(!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                for (Node v : u.getEdges()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}