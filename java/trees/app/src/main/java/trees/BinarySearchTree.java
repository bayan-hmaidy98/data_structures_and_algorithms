package trees;

public class BinarySearchTree <T> extends BinaryTree <T>{


  public boolean contain(T value){
    Node current = this.getRoot();
    if (current == null) return false;
    if(current.equals(value)) return true;
    return contain((T) current.getLeft()) || contain((T) current.getRight());
  }


  public void add(T value){

    Node current = new Node(this.root);

    if (this.getRoot() == null) {
      this.setRoot(new Node<>(value));
      return;
    }

    else if ((int) value < (int) current.getValue() ) {
      if (current.getLeft() == null) {
        current.setLeft(new Node<>(value));

        return;
      } else {
        add((T) current.getLeft().getValue());
      }
    }
    else if ((int) value > (int) current.getValue()){
      if (current.getRight() == null){
        current.setRight(new Node<>(value));
        return;
      }
      else {
        add((T) current.getRight().getValue());
      }
    }
  }
  }
