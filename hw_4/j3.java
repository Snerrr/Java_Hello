//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

package hw_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
      System.out.println("Please, enter size, minimal and maximal values: ");
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      int min = scan.nextInt();
      int max = scan.nextInt();
      LinkedList<Integer> list = new LinkedList<>(j1.randomElements(size, min, max));
      System.out.println(list);
      int sum = sumElements(list);
      System.out.printf("The summary of list equals %d", sum);


  }
  static int sumElements(LinkedList<Integer> list){
      Iterator iter = list.iterator();

      int sum = 0;
      while(iter.hasNext()){
          int elem = (int) iter.next();
          sum+=elem;

      }
      return sum;
  }
}
