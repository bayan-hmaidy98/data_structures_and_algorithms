package graphs;

import java.util.*;

public class Graph<T> {
  List<Node<T>> graphList;

  public Graph(){
    graphList = new ArrayList<>();
  }

  public void addNode(Node<T> node){
    graphList.add(node);
  }

  public void addEdge(Node n1, Node n2){
    if(graphList.contains(n1) && graphList.contains(n2)){
      Node current = n1;
      while(current.next != null){
        current = current.next;
      }
      current.next = n2;
    } else
      System.out.println("Invalid");
  }

  public List<Node<T>> getNodes(){
    return graphList;
  }

  public List<Node<T>> getNeighbors(Node n){
    List<Node<T>> edgeList = new ArrayList<>();
    Node current = n;
    while(current != null){
      edgeList.add(current);
      current = current.next;
    }
    return edgeList;
  }

  public int size(){
    return graphList.size();
  }

  @Override
  public String toString() {
    String result = "[";
    for (int i = 0 ; i < graphList.size() - 1 ; i++){
      result += graphList.get(i).value + ", ";
    }
    result += graphList.get(graphList.size()-1).value + "]";
    return result;
  }


}
