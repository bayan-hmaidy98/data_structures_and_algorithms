/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main.java.LinkedLists;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

      LinkedList linkedList = new LinkedList();
      linkedList.insert(5);
      linkedList.insert(20);
      System.out.println(linkedList.toString());
      linkedList.insert(14);
      linkedList.insert(9);
      System.out.println(linkedList.includes(14));
      System.out.println(linkedList.includes(17));
      System.out.println(linkedList.toString());
      linkedList.insertBefore(14,7);

      linkedList.append(72);
      linkedList.insertAfter(14,82);
      System.out.println(linkedList.toString());
      System.out.println(linkedList.head.value);

      System.out.println(linkedList.kth(2));
      System.out.println(linkedList.kth(7));
      LinkedList list1 = new LinkedList();
      list1.append(1);
      list1.append(2);
      list1.append(3);
      LinkedList list2 = new LinkedList();
      list2.append(4);
      list2.append(5);
      list2.append(6);

    }
}
