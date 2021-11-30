package graphs;

import graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

  @Test

  public void test12() {


//    graph.addEdge("Pandora", "Arendelle", 150);
//    graph.addEdge("Pandora", "Metroville", 82);
//
//
//    graph.addEdge("Arendelle", "Metroville", 99);
//    graph.addEdge("Arendelle", "Monstroplolis", 42);
//
//    graph.addEdge("Metroville", "Monstroplolis", 105);
//    graph.addEdge("Metroville", "Narnia", 37);
//    graph.addEdge("Metroville", "Naboo", 26);
//
//    graph.addEdge("Monstroplolis", "Naboo", 73);
//    graph.addEdge("Narnia", "Naboo", 250);
//
//    path.add("Metroville");
//    path.add("Pandora");
//
//    assertEquals("True, $82", graph.graphBusinessTrip(graph, path));
//
//    ArrayList<String> path1 = new ArrayList<>();
//    path1.add("Arendelle");
//    path1.add("Monstroplolis");
//    path1.add("Naboo");
//
//    assertEquals("True, $115", graph.graphBusinessTrip(graph, path1));
//
//    ArrayList<String> path2 = new ArrayList<>();
//    path2.add("Naboo");
//    path2.add("Pandora");
//
//    assertEquals("False, $0", graph.graphBusinessTrip(graph, path2));
//
//    ArrayList<String> path3 = new ArrayList<>();
//    path3.add("Narnia");
//    path3.add("Arendelle");
//    path3.add("Naboo");
//
//    assertEquals("False, $0", graph.graphBusinessTrip(graph, path3));
  }

}
