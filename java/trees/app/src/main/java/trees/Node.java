package trees;

public class Node <T> {
//  public Node(T value) {
//    this.value = value;
//  }

  public Node<T> getLeft() {
    return left;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void setLeft(Node<T> left) {
    this.left = left;
  }

  public Node<T> getRight() {
    return right;
  }

  public void setRight(Node<T> right) {
    this.right = right;
  }

  private Node <T> left;
 private Node <T> right;
  private T value;


  public Node(T value) {
    this.value = value;
  }
}
