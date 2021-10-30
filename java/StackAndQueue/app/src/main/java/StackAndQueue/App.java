/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
      Stack stack1 = new Stack();
      Stack stack2 = new Stack();
      stack1.push(3);
      stack1.push(4);
      stack1.push(7);
      System.out.println(stack1.toString());
      stack1.pop();
      System.out.println(stack1.toString());
      stack1.push(13);
      stack1.push(2);
      stack1.push(25);
      System.out.println(stack1.toString());
      System.out.println(stack1.peek());
      System.out.println(stack1.isEmpty());
      System.out.println(stack2.isEmpty());
      System.out.println(stack2.peek());
      System.out.println(stack2.pop());

      Queue queue1 = new Queue();
      Queue queue2 = new Queue();
      queue1.enQueue(5);
      queue1.enQueue(7);
      queue1.enQueue(3);
      queue1.enQueue(10);
      System.out.println(queue1.toString());
      queue1.deQueue();
      System.out.println(queue1.toString());
      queue1.enQueue(15);
      queue1.enQueue(23);
      System.out.println(queue1.toString());
      System.out.println(queue1.peek());
      System.out.println(queue1.isEmpty());
      System.out.println(queue2.peek());
      System.out.println(queue2.isEmpty());
      System.out.println(queue2.deQueue());

     PseudoQueue pseudoQueue = new PseudoQueue();
     pseudoQueue.pseudoEnqueue(5);
     pseudoQueue.pseudoEnqueue(3);
     pseudoQueue.pseudoEnqueue(10);
     System.out.println(pseudoQueue.toString());
     System.out.println(pseudoQueue.pseudoDequeue());


    }



}
