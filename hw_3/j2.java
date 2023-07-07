// Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее арифметическое из этого списка. Collections.max()

package hw_3;

import java.util.ArrayList;
import java.util.Random;

public class j2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list = random(30,1,40);
    System.out.println(min(list));
    System.out.println(max(list));
    System.out.println(sr_arifm(list));
  }
  static ArrayList<Integer> random(int kol, int min, int max){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Random random = new Random();
    for (int i = 0; i < kol; i++) {
      int a = random.nextInt(min, max);
      System.out.print(a + " ");
      list.add(i, a);
    }
    System.out.println();
    return list;
  }
  static int max(ArrayList<Integer> list){
    int len_1 = list.size();
    int max_1 = -9999999;
    for (int i = 0; i < len_1; i++) {
      if (max_1 < list.get(i)){
        max_1 = list.get(i);
      }
    }
    return max_1;
  }
  static int min(ArrayList<Integer> list){
    int len_1 = list.size();
    int min_1 = 9999999;
    for (int i = 0; i < len_1; i++) {
      if (min_1 > list.get(i)){
        min_1 = list.get(i);
      }
    }
    return min_1;
  }
  static float sr_arifm(ArrayList<Integer> list){
    int len_1 = list.size();
    int sum = 0;
    for (int i = 0; i < len_1; i++) {
      sum += list.get(i);
    }
    float sr_arifm_1 = sum / len_1;
    return sr_arifm_1;
  }
}

