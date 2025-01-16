import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class GraphVisualization extends Application {

    // Map to store node positions
    private final Map<String, Circle> nodes = new HashMap<>();

    @Override
    public void start(Stage primaryStage) {
        // Create a Pane for the graph
        Pane pane = new Pane();

        // Add nodes (traffic signals)
        addNode(pane, "A", 100, 100);
        addNode(pane, "B", 300, 100);
        addNode(pane, "C", 200, 200);
        addNode(pane, "D", 400, 300);

        // Add edges (roads)
        addEdge(pane, "A", "B");
        addEdge(pane, "A", "C");
        addEdge(pane, "B", "D");
        addEdge(pane, "C", "D");

        // Set up the Scene and Stage
        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setTitle("Graph Visualization");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Adds a node (traffic signal) to the graph.
     * @param pane the Pane to add the node to
     * @param id the ID of the node
     * @param x the x-coordinate of the node
     * @param y the y-coordinate of the node
     */
    private void addNode(Pane pane, String id, double x, double y) {
        Circle circle = new Circle(x, y, 15, Color.LIGHTBLUE);
        circle.setStroke(Color.BLACK);
        nodes.put(id, circle);

        pane.getChildren().add(circle);
    }

    /**
     * Adds an edge (road) between two nodes.
     * @param pane the Pane to add the edge to
     * @param from the starting node ID
     * @param to the ending node ID
     */
    private void addEdge(Pane pane, String from, String to) {
        Circle start = nodes.get(from);
        Circle end = nodes.get(to);

        if (start != null && end != null) {
            Line line = new Line(start.getCenterX(), start.getCenterY(), end.getCenterX(), end.getCenterY());
            line.setStroke(Color.GRAY);
            pane.getChildren().add(line);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
