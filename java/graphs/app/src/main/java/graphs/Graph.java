package graphs;

import graph.Vertex;

import java.util.*;

public class Graph<T> {


  Map<graph.Vertex<T>, ArrayList<graph.Vertex<T>>> map = new HashMap<>();

  List<graph.Vertex<T>> MyList = new ArrayList<>();

  public graph.Vertex<T> addNode(T value) {

    graph.Vertex vertex = new graph.Vertex(value);
    map.put(vertex, new ArrayList<>());
    return vertex;

  }

  public Map<graph.Vertex<T>, ArrayList<graph.Vertex<T>>> getMap() {
    return map;
  }

  public void setMap(Map<graph.Vertex<T>, ArrayList<graph.Vertex<T>>> map) {
    this.map = map;
  }

  public void addEdge(graph.Vertex nodeOne, graph.Vertex nodeTwo) {
    map.get(nodeOne).add(nodeTwo);
    map.get(nodeTwo).add(nodeOne);
  }


  public ArrayList<graph.Vertex> getNodes() {

    if (map.isEmpty()) {
      return null;
    }

    ArrayList<graph.Vertex> list = new ArrayList<>();
    list.addAll(map.keySet());
    return list;

  }

  public ArrayList<graph.Vertex<T>> getNeighbors(graph.Vertex node) {
    return map.get(node);
  }

  public int getSize() {
    return map.size();
  }


  public List<graph.Vertex> breadthFirstSearch(graph.Vertex startVertex) {
    Queue<graph.Vertex> queue = new Queue<graph.Vertex>();
    List<graph.Vertex> visited = new ArrayList<>();

    queue.enqueue(startVertex);
    visited.add(startVertex);

    while (!queue.IsEmpty()) {
      graph.Vertex current = queue.dequeue();

      for (graph.Vertex result : getNeighbors(current)) {
        if (!visited.contains(result)) {
          queue.enqueue(result);
          visited.add(result);
        }
      }
    }
    return visited;
  }
  public String graphBusinessTrip(Graph graph,List<String> cities){
    Integer cost=0;
    for (int i=0;i<cities.size()-1;i++){
      Vertex<String> vertex=new Vertex<>(cities.get(i));
      Vertex<String> vertex1=new Vertex<>(cities.get(i+1));
      if (((Map)graph.getMap().get(vertex)).get(vertex1)!=null){
        cost+=((Integer)((Map)graph.getMap().get(vertex)).get(vertex1));
      }
    }
    return cost > 0 ? "True, $" + cost : "False, $" + cost;
  }

  public List<Vertex<T>> depthFirstSearch(Vertex<T> vertex) {
    this.MyList.add(vertex);

    if (!map.get(vertex).isEmpty()) {
      for(Vertex<T> ver :getNeighbors(vertex) ) {
        if (!MyList.contains(ver)){
          depthFirstSearch(ver);
        }
      }
    }
    return MyList;
  }


}
