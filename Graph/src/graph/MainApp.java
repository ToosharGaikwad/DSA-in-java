package graph;

public class MainApp {
    public static void main(String[] args) {

        Graph gp = new Graph();

        Node n1 = new Node("chetan");
        Node n2 = new Node("vaibhav");
        Node n3 = new Node("rushi");

        gp.insertNode(n1);
        gp.insertNode(n2);
        gp.insertNode(n3);

        gp.connectNodes(n1, n2);
        gp.connectNodes(n1, n3);

        gp.printGraph();
    }
}
