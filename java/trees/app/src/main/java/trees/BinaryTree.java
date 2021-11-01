package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

  public int treeMax(){
    int max = 0;
    if (root == null) {
      return max;
    }

    ArrayList<T> maxTree = preOrder(root);

    for (int i = 0; i < maxTree.size(); i++) {
      if(Integer.parseInt("" + maxTree.get(i)) > max){
        max =Integer.parseInt(""+maxTree.get(i));
      }
    }
    return max;
  }

  public static ArrayList<Integer> breadthFirst(BinaryTree<Integer> tree){
    List<Integer> list = new ArrayList();
    Queue<Node<Integer>> queue = new LinkedList<>();

    queue.add(tree.root);

    while (!queue.isEmpty()) {

      Node<Integer> current = queue.remove();
      list.add((Integer) current.getValue());

      if (current.getLeft() != null) queue.add(current.getLeft());
      if (current.getRight() != null) queue.add(current.getRight());

    }
    return (ArrayList<Integer>) list;
  }

}
