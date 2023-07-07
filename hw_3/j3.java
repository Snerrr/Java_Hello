// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке. 
// Collections.frequency(list, item)

package hw_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class j3 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list_1 = new ArrayList<String>();
    zapolnenie(list);
    vivod(list);
    razbiv(list, list_1, 10);
    vivod(list_1);
    povtorenie(list, list_1);

  }
  static ArrayList<String> zapolnenie(ArrayList<String> list){
    list.add("Mercury ");
    list.add("Venus ");
    list.add("Earth ");
    list.add("Mars ");
    list.add("Jupiter ");
    list.add("Saturn ");
    list.add("Uranus ");
    list.add("Neptune ");
    return list;
  }
  static ArrayList<String> vivod(ArrayList<String> list){
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
    }
    System.out.println();
    return list;
  }
  static ArrayList<String> razbiv (ArrayList<String> list, ArrayList<String> list_1, int count){
    for (int i = 0; i < count; i++) {
        Random random = new Random();
        int position = random.nextInt(0, 7);
        list_1.add(list.get(position));
        } 
        return list_1;
      }
  static void povtorenie (ArrayList<String> list, ArrayList<String> list_1){
    for (int i = 0; i < list.size(); i++) {
    // Collections.frequency(list_1, list.get(i));
    System.out.println(list.get(i) + ": " + Collections.frequency(list_1, list.get(i)));
    }
  }
}
