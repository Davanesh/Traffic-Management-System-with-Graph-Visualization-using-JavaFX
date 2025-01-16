import java.util.*;

public class Graph {
    private Map<String, List<Edge>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }

    // Add a new intersection (node)
    public void addNode(String node) {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    // Add a road (edge) between two intersections
    public void addEdge(String source, String destination, int weight) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.get(source).add(new Edge(destination, weight));

        // For undirected graphs, add the reverse edge as well
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(destination).add(new Edge(source, weight));
    }

    // Get all neighbors (connected roads) of a node
    public List<Edge> getNeighbors(String node) {
        return adjList.getOrDefault(node, new ArrayList<>());
    }

    // Display the graph structure
    public void displayGraph() {
        for (String node : adjList.keySet()) {
            System.out.println(node + " -> " + adjList.get(node));
        }
    }
}