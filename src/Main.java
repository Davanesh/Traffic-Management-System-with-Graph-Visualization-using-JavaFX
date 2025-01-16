public class Main {
    public static void main(String[] args) {
        // Create a new graph
        Graph graph = new Graph();

        // Add intersections (nodes)
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Add roads (edges) with weights
        graph.addEdge("A", "B", 10);
        graph.addEdge("A", "C", 15);
        graph.addEdge("B", "D", 12);
        graph.addEdge("C", "D", 10);

        // Display the graph
        graph.displayGraph();
    }
}