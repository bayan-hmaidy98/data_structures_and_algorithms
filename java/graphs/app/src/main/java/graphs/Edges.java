package graphs;

public class Edges <T> {
  private graph.Vertex vertex;
  int Weight;

  public Edges(graph.Vertex vertex, int Weight) {
    this.vertex = vertex;
    this.Weight = Weight;
  }

  public graph.Vertex getVertex() {
    return vertex;
  }

  public void setVertex(graph.Vertex vertex) {
    this.vertex = vertex;
  }

  @Override
  public String toString() {
    return "Edges{" +
      "vertex=" + vertex +
      ", weight=" + Weight +
      '}';
  }
}
