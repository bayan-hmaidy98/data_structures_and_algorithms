package trees;

public class BinarySearchTree <T> extends BinaryTree <T>{


  public boolean contain(Node <T> root, T value){

    if (root == null) return false;
    if(root.getValue() == value) return true;
    return contain(root.getLeft(), value) || contain(root.getRight(), value);
  }

  public void add(Node<Integer> root, Integer value){
    Node<Integer> newNode = new Node(value);

      if(root == null){
        root.equals(newNode);
      }
      if (value > root.getValue()) {
        if (root.getLeft() == null) {
          root.setLeft(newNode);
          return;
        } else {
          add(root.getLeft(), value);
        }
      }
      if (value >  root.getValue()){
       if (root.getRight() == null){
         root.setRight(newNode);
         return;
       }
       else {
         add(root.getRight(), value);
       }
      }


  }
  }
