package StackAndQueue;
import main.java.StackAndQueue.Node;

public class Stack <T> {

  Node top;

  public void push(T value){
    Node newNode = new Node(value);
    newNode.setNext(top);
    top = newNode;
  }

  public T pop(){
    if(top == null){
      return (T) "Can't pop from an empty stack";
    }
    Node <T> temp = top;
    top = top.getNext();
    temp.setNext(null);
    return  temp.getValue();
  }

  public T peek(){
    if(top == null){
      return (T) "There's no Top";
    }
    return (T) top.getValue();
  }

  public Boolean isEmpty(){
    if(top == null){
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public String toString() {

    Node current = top;
    String print = "";
    while (current != null){
      print += " { " + current.getValue() + " } " + " -> ";
      current = current.getNext();
    }
    print += "{ NULL }";
    return print;
  }
}

