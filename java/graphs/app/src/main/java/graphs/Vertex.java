package graph;

import java.util.HashSet;

public class Vertex<T> {
  public T Value;
  public graph.Vertex next;
//    public HashSet<Edges> neighbors;


  public Vertex(T value) {
    Value = value;
  }

  public Vertex() {
  }

  public T getValue() {
    return Value;
  }

  public void setValue(T value) {
    Value = value;
  }

  @Override
  public String toString() {
    return "Vertex{" +
      "Value=" + Value +
      '}';
  }
}
