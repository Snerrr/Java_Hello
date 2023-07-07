// Пусть дан произвольный список целых чисел, удалить из него четные числа

package hw_3;

import java.util.Random;

public class j1 {
  public static void main(String[] args) {
    int arr[] = random(12, 1, 30);
    System.out.println();
    chet(arr);
  }
  static int[] random(int kol, int min, int max){
    int arr[] = new int[kol];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(min, max);
      System.out.print(arr[i] + " ");
    }
    return arr;  
  }
  static int[] chet(int[]arr){
    int kol = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0){
        kol += 1;
      }
    }
    int arr_1[] = new int[kol]; 
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0){
        arr_1[j] = i;
        System.out.print(arr[i] + " ");
        j += 1;
      }
    }
    return arr_1;
  }
}