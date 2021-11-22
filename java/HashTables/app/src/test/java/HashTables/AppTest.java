/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTables;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

  @Test void testHashTableAddingKeyValue() {
    HashTable<String, Integer> test = new HashTable<>();
    test.add("bayan",3);
    boolean output = test.contains("bayan");
    assertTrue(output);
  }

  @Test void testRetrievingAddedValue(){
    HashTable<String, Integer> test = new HashTable<>();
    test.add("bayan",3);
    int output = test.get("bayan");
    assertEquals(output, 3);
  }

  @Test void testReturnNull(){
    HashTable<String, Integer> test = new HashTable<>();
    Integer output = test.get("bayan");
    assertNull(output);
  }
  @Test
  void testRepeatedWord() {

    HashTable<String, Integer> test = new HashTable<>();
    String input1 = "Once upon a time, there was a brave princess who...";
    String input2 =
      "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, " + "we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in " + "short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    String input3 = "It was a queer, sultry summer the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

    assertEquals("a", test.repeatedWord(input1));
    assertEquals("it", test.repeatedWord(input2));
    assertEquals("summer", test.repeatedWord(input3));
  }

  @Test void testTreeComparison(){
    TreeSet tree1 = new TreeSet();
    TreeSet tree2 = new TreeSet();

    tree1.add(1);
    tree1.add(2);
    tree1.add(3);
    tree1.add(4);

    tree2.add(1);
    tree2.add(4);
    tree2.add(9);
    tree2.add(16);

    TreeIntersection treeIntersection = new TreeIntersection();
    System.out.println(treeIntersection.treeComparing(tree1,tree2).toString());
  }
}
