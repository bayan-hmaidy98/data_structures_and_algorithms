package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T> {

  public Node<T> getRoot() {
    return root;
  }

  public void setRoot(Node<T> root) {
    this.root = root;
  }

  ArrayList<T> list = new ArrayList<>();
  Node root;

  public ArrayList<T> preOrder(Node root) {
    if (root != null) {
      list.add((T) root.getValue());
      preOrder(root.getLeft());
      preOrder(root.getRight());
    }

    return list;
  }

  public ArrayList<T> inOrder(Node root) {
    if (root != null) {
      inOrder(root.getLeft());
      list.add((T) root.getValue());
      inOrder(root.getRight());
    }
    return list;
  }

  public ArrayList<T> postOrder(Node root) {
    if (root != null) {
      inOrder(root.getLeft());
      inOrder(root.getRight());
      list.add((T) root.getValue());
    }
    return list;
  }
}
