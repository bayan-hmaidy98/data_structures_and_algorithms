package graphs;

import graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test void breadth () {
    Graph<String> graph = new Graph();

    Vertex vertex1 = graph.addNode("Pandora");
    Vertex vertex2 = graph.addNode("Arendelle");
    Vertex vertex3 = graph.addNode("Metroville");
    Vertex vertex4 = graph.addNode("Monstroplolis");
    Vertex vertex5 = graph.addNode("Narnia");
    Vertex vertex6 = graph.addNode("Naboo");


    graph.addEdge(vertex1, vertex2);
    graph.addEdge(vertex2, vertex3);
    graph.addEdge(vertex3, vertex4);
    graph.addEdge(vertex4, vertex5);
    graph.addEdge(vertex5, vertex6);


    List<Vertex> breadthFirst = graph.breadthFirstSearch(vertex1);

    assertEquals("Pandora", breadthFirst.get(0).Value);
    assertEquals("Arendelle", breadthFirst.get(1).Value);
    assertEquals("Metroville", breadthFirst.get(2).Value);
    assertEquals("Monstroplolis", breadthFirst.get(3).Value);
    assertEquals("Narnia", breadthFirst.get(4).Value);
    assertEquals("Naboo", breadthFirst.get(5).Value);
  }

}
