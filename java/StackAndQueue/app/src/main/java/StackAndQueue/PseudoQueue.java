package main.java.StackAndQueue;

public class PseudoQueue <T> {
  Stack stack1 = new Stack();
  Stack stack2 = new Stack();

  public void pseudoEnqueue(T value) {
    stack1.push(value);
  }

  public T pseudoDequeue() {
//    Algorithm:
//* Create a function with no parametes
//* create a popValue variable
//* if stack2 is empty
//a. while top is not equal to null, push the top of stack1 to stack2
//* assign popValue to pop()
//* return pop
    T popValue;
    if (stack2.isEmpty()) {
      while (stack1.top != null) {
        stack2.push(stack1.pop());
      }
    }

    popValue = (T) stack2.pop();
//    while (stack2.top != null){
//      stack1.push(stack2.pop());
//    }
    return (T) popValue;
  }

}
