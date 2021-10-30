package StackAndQueue;

public class AnimalShelter {

  Queue cats = new Queue();
  Queue dogs = new Queue();

  public void enqueue(Animal animal) {
    if (animal instanceof Cats) cats.enQueue(animal.getName());
    else if (animal instanceof Dogs) dogs.enQueue(animal.getName());
  }

  public String dequeue(String pref){
    if (pref.equals("cats") && !cats.isEmpty()) return (String) cats.deQueue();
    else if (pref.equals("dogs") && !dogs.isEmpty()) return (String) dogs.deQueue();
    return null;
  }
  @Override
  public String toString() {
    return "AnimalShelter{" +
      "catList=" + cats +
      ", dogList=" + dogs +
      '}';
  }
}
