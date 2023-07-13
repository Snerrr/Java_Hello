package hw_4;

import java.util.Iterator;
import java.util.LinkedList;


public class MyQueue {
  LinkedList<Object> list = new LinkedList<>();
  int size;

  void enqueue(Object element){
      list.add(element);
  }

  Object dequeue(){
      Object elem = list.getFirst();
      Object element = elem;
      list.remove(elem);
      return element;
  }

  Object first(){
      Object elem = list.getFirst();
      return elem;
  }

  void iteratorMyQueue() {

      Iterator iter = list.iterator();
      while(iter.hasNext()){
          System.out.print(iter.next() + " ");
      }
      System.out.println(" ");
  }
}
