package trees;

public class BinarySearchTree <T> extends BinaryTree <T>{


  //working
  public boolean contain(T value){
    Node current = this.getRoot();
    while (current != null){
      if(current.equals(value)) return true;
      else if((int) value < (int) current.getValue()){
        current = current.getLeft();
      }
      else {
        current = current.getRight();
      }
    }
    return false;
  }


  public void add(T value){
    Node current = this.getRoot();

    if (this.root == null) {
      this.setRoot(new Node<>(value));
      return;
    }

    while(current != null){
      if((int) value < (int) current.getValue() ){
        if (current.getLeft() == null) {
          current.setLeft(new Node<>(value));

          return;
        } else {
          current = current.getLeft();
        }
      }
      else {
        if (current.getRight() == null) {
          current.setRight(new Node<>(value));
          return;
        } else {
          current = current.getRight();
        }
      }
    }
  }

}
