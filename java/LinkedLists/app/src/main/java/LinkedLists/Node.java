

package main.java.LinkedLists;

public class Node <T> {
  public Node <T> next;
  public T value;


  public Node(T value){
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;

  }
}
