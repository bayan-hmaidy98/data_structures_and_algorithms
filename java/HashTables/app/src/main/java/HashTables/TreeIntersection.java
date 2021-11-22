package HashTables;

import org.checkerframework.checker.units.qual.K;

import java.util.TreeSet;

public class TreeIntersection {

// Here I assumed that the values we are comparing in the trees are integers
  public HashTable<Integer, Integer> treeComparing(TreeSet<Integer> tree1, TreeSet <Integer>tree2){
    HashTable <Integer, Integer> table = new HashTable<>();
    for(Integer number: tree1){
      if(tree2.contains(number)) table.add(number, number);
    }
    return table;
  }
}
