 package graph;

import java.util.*;

public class Graph {

    Map<Node, List<Node>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void insertNode(Node n) {
        adjacencyList.put(n, new ArrayList<>());
    }

    public void connectNodes(Node n1, Node n2) {
        adjacencyList.get(n1).add(n2);
        adjacencyList.get(n2).add(n1); // for undirected graph
    }

    public void printGraph() {
        for (Node current : adjacencyList.keySet()) {
            System.out.print(current.data + " -> ");
            List<Node> neighbors = adjacencyList.get(current);
            for (Node next : neighbors) {
                System.out.print(next.data + " ");
            }
            System.out.println();
        }
    }
}
