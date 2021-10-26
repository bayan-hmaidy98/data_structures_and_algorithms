package main.java.StackAndQueue;

public class Queue <T>{

  Node front;
  Node back;

  public void enQueue(T value){
    if (front == null){
      Node newNode = new Node(value);
      front = newNode;
      back = newNode;
    }
    else {
      Node newNode = new Node(value);
      back.setNext(newNode);
      back = newNode;
    }

  }

  public T deQueue(){
    if (front == null){
      return (T) "Can't dequeue from the queue";
    }
    else {
      Node temp = front;
      front = front.getNext();
      temp.setNext(null);
      return (T) temp.getValue();
    }
  }

  public T peek(){
    if (front == null){
      return (T) "Queue is empty";
    }
    else {
      return (T) front.getValue();
    }
  }

  public Boolean isEmpty(){
    if(front == null){
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public String toString() {
    Node current = front;
    String print = "";
    while (current != null){
      print += " { " + current.getValue() + " } " + " -> ";
      current = current.getNext();
    }
    print += "{ NULL }";
    return print;

  }
}
