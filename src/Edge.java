public class Edge {
    String destination; // The target node
    int weight;         // The weight of the edge (e.g., distance or traffic level)

    public Edge(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return destination + " (" + weight + ")";
    }
}