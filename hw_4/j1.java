// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
// который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

package hw_4;

import java.util.*;

public class j1 {
  public static void main(String[] args) {

    System.out.println("Please, enter size, minimal and maximal values: ");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int min = scan.nextInt();
    int max = scan.nextInt();
    LinkedList<Integer> linkedList = new LinkedList<>(randomElements(size, min, max));
    System.out.println(linkedList);
    linkedList = reverseList(linkedList);
    System.out.println(linkedList);
}
static ArrayList<Integer> randomElements(int size, int min, int max){
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<>();
    while(size>0){
        list.add(random.nextInt(min, max+1));
        size--;
    }
    return list;
}

static LinkedList<Integer> reverseList(LinkedList<Integer> list){
    ListIterator iter = list.listIterator(list.size());
    LinkedList<Integer> newList = new LinkedList<>();

    while(iter.hasPrevious()){
        int elem = (int) iter.previous();
        newList.add(elem);
    }
    return newList;
}
}
