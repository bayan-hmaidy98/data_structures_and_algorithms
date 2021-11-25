package HashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashTable <K, V>{

  public int size;
  public int buckets;

  public ArrayList<HashNode> table;

  public HashTable(){

    table = new ArrayList<>();
    size = 0;
    buckets = 10;

    for (int i = 0; i < buckets; i++) {
      table.add(null);
    }
  }

  public  String repeatedWord(String string) {
    String output = null;
    String[] stringArr = string.split(" ");
    HashTable hashTable = new HashTable<>();

    for (int i = 0; i < stringArr.length; i++) {
      if (hashTable.contains(stringArr[i])) {
        output = stringArr[i];
        break;
      }
      hashTable.add(stringArr[i].toLowerCase(), i);
    }
    return output;
  }

  public int hash(K key) {
    return (Math.abs(key.hashCode())) % buckets;
  }


  public V get(K key){
    int keyIndex = hash(key);
    HashNode<K,V> head = table.get(keyIndex);

    while (head != null){
      if (head.key.equals(key)) return head.value;
      head = head.next;
    }
    return null;
  }

  public void add(K key, V value){

    int keyIndex = hash(key);
    HashNode head = table.get(keyIndex);

    while (head != null){
      // in case we have found the same key already exits in the linked list, there's no need to add it
      if (head.key.equals(key)) break;
      head = head.next;
    }
    size++;
    // after moving the head pointer, we need to rest it again
    head = table.get(keyIndex);

    // now, we need to create a new node and assert it to the linked list.

    HashNode newNode = new HashNode(key, value);
    // in linked list we assert the node to the beginning of the linked list.
    newNode.next = head;
    // we add to the array in the index we calculated the new node we have created.
    table.set(keyIndex, newNode);

    // let's check load factor, we need to check the load factor of the array, in other word if the array is almost full or not to double the size if needed
//    if (size*1 >= 0.7* buckets){
//      ArrayList tempArr = table;
//      // reinitialize the array again after saving the values, we need to do this when giving the new size of the array below
//      buckets = buckets * 2;
//      size = 0;
//
//      // now, we need to increase the size of the array
//      for (int i = 0; i < buckets; i++){
//        table.add(null);
//      }
//
//      // copy the values in temp
//      for (HashNode head: tempArr){
//
//      }
//      for (HashNode headNode : tempArr) {
//        while (headNode != null) {
//          add(headNode.key, headNode.value);
//          headNode = headNode.next;
//        }
//    }

  }

  public boolean contains(K key){

    // this function is the same as get since we need to check the whole linked list to figure if the key exists or not
    int keyIndex = hash(key);
    HashNode<K,V> head = table.get(keyIndex);

    while (head != null){
      if (head.key.equals(key)) return true;
      head = head.next;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    for (HashNode<K, V> bucket : table) {
      if (bucket != null) sb.append(bucket.toString()).append(", ");
    }
    if (sb.length() == 1) return "{}";
    return sb.substring(0, sb.toString().trim().length() - 1) + "}";
  }
}
