package trees;

import java.util.ArrayList;

public class BinaryTree <T>{

  public Node<T> getRoot() {
    return root;
  }

  public void setRoot(Node<T> root) {
    this.root = root;
  }

  public Node<T> root;

  public ArrayList<T> preOrder(Node root) throws IllegalArgumentException{
    ArrayList <T> list = new ArrayList();
    if(root != null){
      list.add((T) root);

      if(root.getLeft() != null){
        list.add((T) preOrder(root.getLeft()));
      }
      if(root.getRight() != null){
        list.add((T) preOrder(root.getRight()));
      }
    }
    else {
      throw new IllegalArgumentException("The tree is empty");
    }
    return list;
  }


  public ArrayList<T> inOrder(Node root) throws IllegalArgumentException{
    ArrayList<T> list = new ArrayList();

    if (root != null){
      if (root.getLeft() != null){
        list.add((T) inOrder(root.getLeft()));
      }
      list.add((T) root);

      if (root.getRight() != null){
        list.add((T) inOrder(root.getRight()));
      }
    }
    else {
      throw new IllegalArgumentException("The tree is empty");
    }
    return list;
  }

  public ArrayList<T> postOrder(Node root) throws IllegalArgumentException{
    ArrayList<T> list = new ArrayList<>();

    if (root != null){
      if(root.getLeft() != null){
        list.add((T) postOrder(root.getLeft()));
      }
      if(root.getRight() != null){
        list.add((T) postOrder(root.getRight()));
      }

      list.add((T) root);
    }
    else {
      throw new IllegalArgumentException("The tree is empty");
    }
    return list;
  }

  public String treeMax(){
    if (root == null) {
      return "Empty";
    }
    int max = 0;
    ArrayList<T> maxTree = preOrder(root);

    for (int i = 0; i < maxTree.size(); i++) {
      if(Integer.parseInt(""+maxTree.get(i)) > max){
        max =Integer.parseInt(""+maxTree.get(i));
      }
    }
    return "The maximum number is "+max;
  }
}
