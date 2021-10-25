/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test.java.LinkedLists;

import main.java.LinkedLists.App;
import main.java.LinkedLists.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }


  @Test
  void emptyLinkedList(){
    LinkedList linkedList = new LinkedList();
    linkedList.insert(5);
    linkedList.insert(20);
    linkedList.insert(14);
    linkedList.insert(9);
    assertEquals(9, linkedList.head.value);
    assertTrue(linkedList.includes(5));
    assertFalse(linkedList.includes(2));
    assertEquals("{ 9 } -> { 14 } -> { 20 } -> { 5 } -> NULL", linkedList.toString());
  }

}