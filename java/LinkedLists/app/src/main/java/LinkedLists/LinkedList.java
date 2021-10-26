package main.java.LinkedLists;

import java.util.ArrayList;

public class LinkedList <T> {
  public Node head;
  private int counter = 0;

  //working
  public void insert(T value) {
    Node first = new Node(value);
    if (head == null) {
      head = first;
    } else {
      first.setNext(head);
      head = first;
    }
  }

  //working
  public boolean includes(T value) {
    Node current = head;
    while (current != null) {
      if (current.value.equals(value)) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  //working
  public void append(T value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
    } else {

      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);

    }

  }


  public void insertBefore(T previous, T newValue) {
//working
    Node current = head;
    Node newNode = new Node(newValue);
    if (head.value == previous) {
      newNode.setNext(head);
      head = newNode;
    }
    while (current.getNext() != null) {
      if (current.next.value == previous) {

        newNode.setNext(current.getNext());
        current.setNext(newNode);
        break;
      } else {
        current = current.getNext();
      }
    }
  }

  //working
  public void insertAfter(T value, T newValue) {

    Node current = head;
    while (current != null) {
      if (current.value == value) {
        Node newNode = new Node(newValue);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        break;
      } else {
        current = current.getNext();
      }
    }
  }

  public T kth(int k) {

    if (counter == 0) {

      ArrayList<T> arrayConverted = new ArrayList();
      Node currentNode = head;
      while (currentNode != null) {
        arrayConverted.add((T) currentNode.value);
//          [i] = currentNode.value;
        currentNode = currentNode.next;
      }
      int index = arrayConverted.size() - k - 1;
      if (index > 0) {
        return arrayConverted.get(index);
      }
    }
    return (T) (k + " is not valid index");
  }


  //working
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
