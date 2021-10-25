package main.java.LinkedLists;

public class LinkedList <T> {
  public Node head;



  public void insert(T value){
    Node first = new Node(value);
    if (head == null){
      head = first;
    }
    else{
      first.setNext(head);
      head = first;
    }
  }

  public boolean includes(T value){
    Node current = head;
    while(current != null){
      if(current.value.equals(value)){
        return true;
      }
      current = current.getNext();
    }
    return false;
  }
  @Override
  public String toString() {
    Node current = head;
    String output = "";
    while (current != null){
      output+= "{ " + current.value + " }" + " -> ";
      current = current.getNext();
    }
    output+= "NULL";
    return output;
  }



}
