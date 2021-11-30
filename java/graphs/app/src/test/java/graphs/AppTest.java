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

  @Test void depth(){
    Graph graph = new Graph();
    Vertex vertex = graph.addNode("1");
    Vertex vertex1 =  graph.addNode("2");
    Vertex vertex2 = graph.addNode("3");
    Vertex vertex3 = graph.addNode("4");
    Vertex vertex4 = graph.addNode("5");
    Vertex vertex5 = graph.addNode("6");
    Vertex vertex6 = graph.addNode("7");
    Vertex vertex7 = graph.addNode("8");
    Vertex vertex8 = graph.addNode("9");
    Vertex vertex9 = graph.addNode("10");


    graph.addEdge(vertex,vertex1);
    graph.addEdge(vertex,vertex3);
    graph.addEdge(vertex1,vertex2);
    graph.addEdge(vertex1,vertex3);
    graph.addEdge(vertex2,vertex6);
    graph.addEdge(vertex3,vertex4);
    graph.addEdge(vertex3,vertex7);
    graph.addEdge(vertex3,vertex5);
    graph.addEdge(vertex7,vertex5);
    graph.addEdge(vertex7,vertex8);
    graph.addEdge(vertex8,vertex9);

    List<Vertex<String>> MyList = new ArrayList<>();
    MyList.add(vertex);
    MyList.add(vertex1);
    MyList.add(vertex2);
    MyList.add(vertex6);
    MyList.add(vertex3);
    MyList.add(vertex4);
    MyList.add(vertex7);
    MyList.add(vertex5);
    MyList.add(vertex8);
    MyList.add(vertex9);

    assertEquals(MyList , graph.depthFirstSearch(vertex));



  }

}
