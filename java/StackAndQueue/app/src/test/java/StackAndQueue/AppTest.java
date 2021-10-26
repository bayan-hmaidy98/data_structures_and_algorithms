/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test.java.StackAndQueue;

import main.java.StackAndQueue.App;
import main.java.StackAndQueue.Queue;
import org.junit.jupiter.api.Test;


import main.java.StackAndQueue.Stack;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

  @Test void stackTest() {
//        App classUnderTest = new App();
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    stack1.push(3);
    stack1.push(4);
    stack1.push(7);
    String expected = " { 7 }  ->  { 4 }  ->  { 3 }  -> { NULL }";

    assertEquals(expected, stack1.toString());
    stack1.pop();
    String expected1 = " { 4 }  ->  { 3 }  -> { NULL }";
    assertEquals(expected1, stack1.toString());
    assertEquals("There's no Top" , stack2.peek());
    assertEquals(4, stack1.peek());
    assertEquals("true", stack2.isEmpty().toString());
    assertEquals("false", stack1.isEmpty().toString());
  }

  @Test void queueTest(){
    Queue queue1 = new Queue();
    Queue queue2 = new Queue();
    queue1.enQueue(5);
    queue1.enQueue(7);
    queue1.enQueue(3);
    queue1.enQueue(10);
    System.out.println(queue1.toString());
    assertEquals(" { 5 }  ->  { 7 }  ->  { 3 }  ->  { 10 }  -> { NULL }", queue1.toString());
    queue1.deQueue();
    assertEquals(" { 7 }  ->  { 3 }  ->  { 10 }  -> { NULL }", queue1.toString());
    assertEquals("Queue is empty" , queue2.peek());
    assertEquals(7, queue1.peek());
    assertEquals("true", queue2.isEmpty().toString());
    assertEquals("false", queue1.isEmpty().toString());
  }
}
