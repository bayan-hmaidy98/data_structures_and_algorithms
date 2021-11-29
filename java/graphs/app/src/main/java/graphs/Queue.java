package graphs;

import graph.Vertex;

public class Queue <T>{
  graph.Vertex<T> rear;
  graph.Vertex front;

  public Queue() {
    rear = null;
    front = null;
  }

  public void enqueue(T value) {
    Vertex NewNode = new Vertex<>(value);
    if (IsEmpty()) {
      front = NewNode;
      rear = NewNode;
    } else {
      rear.next = NewNode;
      rear = NewNode;
//            New.next = rear;
    }
  }

  public T dequeue() {
    graph.Vertex<T> temp = front;
    if (!IsEmpty()) {
      temp = front;
      front = front.next;
      ((Vertex<T>) temp).next = null;
      return temp.Value;
    }
    try {
      throw new Exception("Empty Queue");
    } catch (Exception e) {
      e.printStackTrace();
      e.getCause();
      return null;
    }
  }


  public boolean IsEmpty() {
    if (front == null) {
      return true;
    } else {
      return false;
    }
  }


}
